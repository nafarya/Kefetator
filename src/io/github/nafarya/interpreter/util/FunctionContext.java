package io.github.nafarya.interpreter.util;

import java.util.Map;

/**
 * Created by dan on 17.10.17.
 */
public class FunctionContext extends VariableContext {
    public FunctionContext(Map<String, Integer> context) {
        super(context);
    }
}
