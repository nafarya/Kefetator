package io.github.nafarya.interpreter.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dan on 17.10.17.
 */
public class EvalLangVisitor extends LangBaseListener {

    private Map<String, LangParser.FunctionContext> functions;

    public EvalLangVisitor() {
        this.functions = new HashMap<>();
    }

    @Override
    public void enterFunction(LangParser.FunctionContext ctx) {
        super.enterFunction(ctx);
    }

    @Override
    public void exitFunction(LangParser.FunctionContext ctx) {
        super.exitFunction(ctx);

        final String functionName = ctx.NAME().getText();
        if ("main".equals(functionName)) {
            if (!ctx.args().arg().isEmpty()) {
                throw new RuntimeException("'main' function must have no args");
            }
        }

        functions.put(functionName, ctx);
    }

    @Override
    public void exitProg(LangParser.ProgContext ctx) {
        super.exitProg(ctx);
        if (!functions.containsKey("main")) {
            throw new RuntimeException("No 'main' function");
        }
    }
}
