package io.github.nafarya.interpreter.util;

import java.util.Map;

/**
 * Created by dan on 17.10.17.
 */
public abstract class VariableContext {
    private Map<String, Integer> context;

    public VariableContext(Map<String, Integer> context) {
        this.context = context;
    }

    public Map<String, Integer> getContext() {
        return context;
    }
}
