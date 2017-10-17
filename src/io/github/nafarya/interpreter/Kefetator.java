package io.github.nafarya.interpreter;

import io.github.nafarya.interpreter.parser.LangParser;
import io.github.nafarya.interpreter.util.FunctionContext;
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
        return evalFunction(functions.get("main"), Arrays.asList());
    }

    private int evalFunction(LangParser.FunctionContext ctx, List<Integer> evaluatedArgs) {
        VariableContext vc = new FunctionContext();
        for (int i = 0; i < evaluatedArgs.size(); i++) {
            final String argName = ctx.funcDeclArgs().NAME().get(i).getText();
            vc.getContext().put(argName, evaluatedArgs.get(i));
        }
        contextStack.add(vc);
        for (LangParser.StatementContext st : ctx.funcBody().statement()) {
            evalStatement(st);
        }
        return 0;
    }

    private void evalStatement(LangParser.StatementContext st) {
        if (st.print() != null) {
            System.out.println(evalAtom(st.print().atom()));
        }
    }

    private int evalAtom(LangParser.AtomContext ctx) {
        if (ctx.NUM() != null) {
            return Integer.parseInt(ctx.NUM().getText());
        } else if (ctx.NAME() != null) {
            return lookupVariable(ctx.NAME().getText());
        } else if (ctx.funccall() != null) {
            throw new RuntimeException("Unimplemented");
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

}
