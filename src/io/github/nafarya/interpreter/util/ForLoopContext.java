package io.github.nafarya.interpreter.util;

import java.util.HashMap;

/**
 * Created by dan on 17.10.17.
 */
public class ForLoopContext extends VariableContext {
    public ForLoopContext() {
        super(new HashMap<>());
    }
}
