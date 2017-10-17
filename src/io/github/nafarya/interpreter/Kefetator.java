package io.github.nafarya.interpreter;

import io.github.nafarya.interpreter.parser.LangParser;
import io.github.nafarya.interpreter.util.FunctionContext;
import io.github.nafarya.interpreter.util.VariableContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public int evalkaif(LangParser.ProgContext ctx) {
        for (LangParser.FunctionContext fctx : ctx.function()) {
            final String functionName = fctx.NAME().getText();
            functions.put(functionName, fctx);
        }
        return evalFunction(functions.get("main"));
    }

    private int evalFunction(LangParser.FunctionContext ctx) {
        Map<String, Integer> mp = new HashMap<>();
        VariableContext vc = new FunctionContext(mp);
        contextStack.add(vc);
        // fill parameters
    }

}
