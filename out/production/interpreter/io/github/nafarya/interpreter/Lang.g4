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

function
locals [
    Map<String, Integer> vc = new HashMap<>()
]
    : 'func' name=NAME '(' args ')' '{'  funcbody '}'
    ;

args
    : arg*
    ;

arg
    : NAME | NUM
    ;

funcbody
    : statement*
    ;

ifbody
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
    ;

forloop
    : 'for' '(' (NAME | NUM) ')' '{' forbody '}'
    ;

condition
    : expr
    ;

ifclause
    : 'if' '(' expr ')' '{' ifbody '}' ('else' '{' ifbody '}')?
    ;

ret
    : 'return' expr SEMICOLON
    | 'return' NAME SEMICOLON
    ;

assignment returns [int value]
    : NAME EQ x=expr SEMICOLON
    {
        mp.put($NAME.text, $x.value);
        $value = $x.value;
    }
    ;

print
    : 'print' '(' x=expr ')' SEMICOLON { System.out.println($x.value); }
    | 'print' '(' NAME ')' SEMICOLON
    {
        Integer v = (Integer)mp.get($NAME.text);
        if (v == null) {
            System.out.println("Undefined variable: " + $NAME.text);
        } else {
            System.out.println(v.intValue());
        }
    }
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
    : NUM { $value = Integer.parseInt($NUM.text); }
    | NAME {
        Integer v = (Integer)mp.get($NAME.text);
        if (v == null) {
            System.err.println("Undefined variable: " + $NAME.text);
        } else {
            $value = v.intValue();
        }
      }
    | '(' expr ')'
    ;

//if (mp.containsKey($NAME.text)) { throw new RuntimeException("Variable redeclared)
NAME : [a-zA-z] [a-zA-Z0-9]*;
EQ : '=';
SEMICOLON : ';';
NUM : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines