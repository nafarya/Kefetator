package io.github.nafarya.interpreter.util;

import java.util.Map;

/**
 * Created by dan on 17.10.17.
 */
public class ForLoopContext extends VariableContext {
    public ForLoopContext(Map<String, Integer> context) {
        super(context);
    }
}
