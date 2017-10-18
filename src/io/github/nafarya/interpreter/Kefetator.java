package io.github.nafarya.interpreter;

import io.github.nafarya.interpreter.parser.LangParser;
import io.github.nafarya.interpreter.util.FunctionContext;
import io.github.nafarya.interpreter.util.IfClauseContext;
import io.github.nafarya.interpreter.util.VariableContext;

import java.util.*;

/**
 * Created by dan on 17.10.17.
 */
public class Kefetator {

    private Map<String, LangParser.FunctionContext> functions;
    private List<VariableContext> contextStack;

    public Kefetator() {
        functions = new HashMap<>();
        contextStack = new ArrayList<>();
    }

    public int evalProg(LangParser.ProgContext ctx) {
        for (LangParser.FunctionContext fctx : ctx.function()) {
            final String functionName = fctx.NAME().getText();
            functions.put(functionName, fctx);
        }
        return evalFunction("main", Arrays.asList());
    }

    private int evalFunction(String name, List<Integer> evaluatedArgs) {
        LangParser.FunctionContext ctx = functions.get(name);
        if (ctx == null) {
            throw new RuntimeException("Function '" + name + "' is not defined");
        }
        VariableContext vc = new FunctionContext();
        for (int i = 0; i < evaluatedArgs.size(); i++) {
            final String argName = ctx.funcDeclArgs().NAME().get(i).getText();
            vc.getContext().put(argName, evaluatedArgs.get(i));
        }
        pushContext(vc);
        Integer returnValue = evalStatements(ctx.funcBody().statement());
        popContext();
        if (returnValue != null) {
            return returnValue;
        }
        throw new RuntimeException("Function '" + name + "' has no return statement");
    }

    private Integer evalStatements(List<LangParser.StatementContext> statements) {
        for (LangParser.StatementContext st : statements) {
            if (st.print() != null) {
                System.out.println(evalAtom(st.print().atom()));
            } else if (st.assignment() != null) {
                evalAssignment(st.assignment().assignmentBody());
            } else if (st.ret() != null) {
                return evalExpr(st.ret().expr());
            } else if (st.ifclause() != null) {
                // TODO: add ifcaluse variable context
                VariableContext vc = new IfClauseContext();
                pushContext(vc);
                Integer ifReturns = evalIfClause(st.ifclause());
                popContext();
                if (ifReturns != null) {
                    return ifReturns;
                }
            }
        }
        return null;
    }

    private Integer evalIfClause(LangParser.IfclauseContext ctx) {
        int predicate = evalExpr(ctx.ifPredicate().expr());
        if (predicate == 0) {
            return evalStatements(ctx.leftBranch().ifBranch().statement());
        } else {
            if (ctx.rightBranch() != null) {
                return evalStatements(ctx.rightBranch().ifBranch().statement());
            }
        }
        return null;
    }

    private void evalAssignment(LangParser.AssignmentBodyContext ctx) {
        final int value;
        if (ctx.expr() != null) {
            value = evalExpr(ctx.expr());
        } else if (ctx.funccall() != null) {
            List<Integer> args = evalFunctionArgs(ctx.funccall().funcargs());
            value = evalFunction(ctx.funccall().NAME().getText(), args);
        } else {
            throw new RuntimeException("Bad state");
        }
        putVariableInCurrentContext(ctx.NAME().getText(), value);
    }

    // expr = mulExpr + term*
    private int evalExpr(LangParser.ExprContext ctx) {
        int result = evalMulExpr(ctx.mulExpr());
        for (LangParser.TermContext term : ctx.term()) {
            int snd = evalMulExpr(term.mulExpr());
            if (term.ADD() != null) {
                result += snd;
            } else if (term.SUB() != null) {
                result -= snd;
            }
        }
        return result;
    }

    // mulexpr = atom + factor*
    private int evalMulExpr(LangParser.MulExprContext ctx) {
        int result = evalAtom(ctx.atom());

        for (LangParser.FactorContext factor : ctx.factor()) {
            int snd = evalAtom(factor.atom());
            if (factor.MUL() != null) {
                result*= snd;
            } else if (factor.DIV() != null) {
                result /= snd;
            }
        }

        return result;
    }

    private List<Integer> evalFunctionArgs(LangParser.FuncargsContext ctx) {
        List<Integer> args = new ArrayList<>();
        for (LangParser.AtomContext arg : ctx.atom()) {
            args.add(evalAtom(arg));
        }
        return args;
    }

    private int evalAtom(LangParser.AtomContext ctx) {
        if (ctx.NUM() != null) {
            return Integer.parseInt(ctx.NUM().getText());
        } else if (ctx.NAME() != null) {
            return lookupVariable(ctx.NAME().getText());
        } else if (ctx.funccall() != null) {
            List<Integer> args = evalFunctionArgs(ctx.funccall().funcargs());
            return evalFunction(ctx.funccall().NAME().getText(), args);
        }
        return 0;
    }

    private int lookupVariable(String name) {
        int functionContextsSeen = 0;
        for (int i = contextStack.size() - 1; i >= 0; i--) {
            if (contextStack.get(i) instanceof FunctionContext) {
                functionContextsSeen++;
            }
            if (functionContextsSeen > 1) {
                break;
            }
            Integer value = contextStack.get(i).getContext().get(name);
            if (value != null) {
                return value;
            }
        }
        System.err.println("Variable not in scope: " + name); //TODO: throw and handle exception
        return 0;
    }

    private void pushContext(VariableContext vc) {
        contextStack.add(vc);
    }

    private void popContext() {
        contextStack.remove(contextStack.size() - 1);
    }

    private void putVariableInCurrentContext(String name, int value) {

    }

}
