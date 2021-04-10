grammar TinyLanguage_SII;


start_rule : COMPIL IDPROGRAMME '(' ')' '{'
declarations
START
instructions
'}' ;

// déclarations
declarations:  declaration declarations | declaration ;
declaration: type variables ';';
type : INT | FLOAT | STRING;
variables :  ((ID ',' variables) | ID) ;

//instructions
instructions : (instruction ';' instructions) | instruction ';';
instruction : affectation | instif | instwhile | scan | print;

//affectation
affectation : ID AFF exp;
exp : exp operpm exp2 | exp2;
exp2 : exp2 opermd exp3 | exp3;
exp3 : ID | '(' exp ')' | value ;
value : INTEGERVAL | FLOATVAL | STRINGVAL;

operpm : PLUS | MINUS ;
opermd : MUL | DIV ;




//if

instif : IF '(' condition ')' THEN '{' instructions ('}' instelse '{' instructions)? '}';
instelse: ELSE;
condition : exp op exp ;
op : SUP | INF | SUPE | INFE | DIF | EQ;
// do while

instwhile : DO '{' instructions '}' WHILE '(' condition ')';

//lire et ecrire
scan :  SCAN '(' variables ')' ;
print : PRINT '(' (variables | STRINGVAL) ')' ;


// mots clés
COMPIL : 'compil';
START : 'start' ;
INT : 'intCompil';
STRING : 'StringCompil';
FLOAT : 'floatCompil';

SCAN : 'scanCompil' ;
PRINT : 'printCompil' ;

IF : 'if';
THEN : 'then';
ELSE : 'else';

DO : 'do';
WHILE : 'while';


// opérateurs
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
SUP : '>';
INF : '<';
SUPE : '>=';
INFE : '<=';
EQ : '==';
DIF : '!=';
AFF : '=';

IDPROGRAMME : [A-Z][a-zA-Z0-9_]*;
ID : [a-zA-Z][a-zA-Z0-9]*;
INTEGERVAL : '0'|[+-]?[1-9][0-9]*;
FLOATVAL : [+-]?[1-9][0-9]*('.'[0-9]*);
STRINGVAL : '"' (~'"'|'\\"')* '"'  ;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;