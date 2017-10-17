package io.github.nafarya.interpreter;

import io.github.nafarya.interpreter.parser.EvalLangVisitor;
import io.github.nafarya.interpreter.parser.LangLexer;
import io.github.nafarya.interpreter.parser.LangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("prog.kef"), StandardCharsets.UTF_8));
        ANTLRInputStream input = new ANTLRInputStream(in);
        LangLexer lexer = new LangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalLangVisitor visitor = new EvalLangVisitor();
        walker.walk(visitor, parser.prog());
    }
}
