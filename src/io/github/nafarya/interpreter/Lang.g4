grammar Lang;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
HashMap mp = new HashMap();
}

prog returns [int value]
    : function*
    ;

function locals [ Map<String, Integer> vc = new HashMap<>() ]
    : 'func' name=NAME '(' funcDeclArgs ')' '{'  funcBody '}'
    ;

funcDeclArgs
    : NAME*
    ;

funcBody
    : statement*
    ;

ifBranch
    : statement*
    ;

forbody
    : statement*
    ;

statement
    : ret
    | print
    | assignment
    | ifclause
    | forloop
    | funccall
    ;

funccall
    : NAME '(' funcargs ')'
    ;

funcargs
    : atom*
    ;

forloop locals [ Map<String, Integer> vc = new HashMap<>() ]
    : 'for' assignmentBody SEMICOLON atom SEMICOLON assignmentBody '{' forbody '}'
    ;

condition
    : expr
    ;

ifclause locals [ Map<String, Integer> vc = new HashMap<>() ]
    : 'if' '(' expr ')' '{' ifBranch '}' ('else' '{' ifBranch '}')?
    ;

ret
    : 'return' expr SEMICOLON
    | 'return' NAME SEMICOLON
    ;

assignment returns [int value]
    : assignmentBody SEMICOLON
    ;

assignmentBody returns [int value]
    : NAME EQ (expr | funccall)
    ;

print
    : 'print' '(' atom ')' SEMICOLON
    ;

expr returns [int value]
    : x=mulExpr { $value = $x.value; } ('+' y=mulExpr { $value += $y.value; })*
    | x=mulExpr { $value = $x.value; } ('-' y=mulExpr { $value -= $y.value; })*
    ;

mulExpr returns [int value]
    : x=atom { $value = $x.value; } ('*' y=atom { $value *= $y.value; })*
    | x=atom { $value = $y.value; } ('/' y=atom { $value /= $y.value; })*
    ;

atom returns [int value]
    : NUM
    | NAME
    | '(' expr ')'
    | funccall
    ;

//if (mp.containsKey($NAME.text)) { throw new RuntimeException("Variable redeclared)
NAME : [a-zA-z] [a-zA-Z0-9]*;
EQ : '=';
SEMICOLON : ';';
NUM : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines