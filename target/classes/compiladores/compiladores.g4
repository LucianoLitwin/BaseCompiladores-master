grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS: [ \t\r\n]+ -> skip;

// Simbolos
PI: '(';
PD: ')';
LI: '{';
LD: '}';
PYC: ';';
COMA: ',';
PUNTO: '.';
DOSPUNTOS: ':';

// Condicionales
IF: 'if';
ELSE: 'else';
COMPARE: ('<' | '<=' | '>' | '>=' | '==' | '!=');
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';

// Ciclos
FOR: 'for';
WHILE: 'while';

// Utiles
PRINT: 'print';
CADENA: '"' (~["\\] | '\\' .)* '"';
COMENTARIO: '//' .*? '\n' -> skip;
COMENTARIO_MULTILINEA: '/' .? '*/' -> skip;
RETURN: 'return';
BREAK: 'break';

// Aritmetica y lógica
MAS: '+';
MENOS: '-';
MULTI: '*';
DIVI: '/';
ACUM: ('++' | '--');
IGUAL: '=';
ANDOR: ('&&' | '||');

// Tipos de dato/Funciones
VOID: 'void';
DOUBLE: 'double';
FLOAT: 'float';
INT: 'int'; 
LONG: 'long';
STRING: 'string';
STATIC: 'static';
CONST: 'const';


NOMBRE: (LETRA | '')(LETRA | DIGITO | '')* ;
NUMERO: (DIGITO+ | DIGITO+ PUNTO DIGITO+) ;

// Start Rule
programa: (declaracionFuncion | instrucciones) EOF;

instrucciones: instruccion*;

instruccion: llaves
            | declaracion
            | asignacion
            | if
            | for
            | while
            | switch
            | declaracionFuncion
            | llamadaFuncion PYC
            | print
            | return
            | break
            | comentario
            ;

expresion: (NOMBRE | NUMERO | llamadaFuncion) ((MAS | MENOS | MULTI | DIVI | ANDOR) (NOMBRE | NUMERO | llamadaFuncion))*;

condicion: (NOMBRE | NUMERO | llamadaFuncion) (COMPARE (NOMBRE | NUMERO | llamadaFuncion))*;

llaves: LI instrucciones LD;

declaracion: (STATIC | CONST)? (INT | FLOAT | DOUBLE | STRING) NOMBRE PYC
            | (STATIC | CONST)? (INT | FLOAT | DOUBLE | STRING) asignacion;

asignacion: NOMBRE IGUAL expresion PYC;

if: IF PI condicion PD llaves (ELSE llaves)?;

expresionFor: INT asignacion condicion PYC NOMBRE ACUM;

for: FOR PI expresionFor PD llaves;

while: WHILE PI condicion PD llaves;

switch: SWITCH PI expresion PD bloqueSwitch;

bloqueSwitch: LI (case)* default? LD;

case: CASE expresion DOSPUNTOS instrucciones;

break: BREAK PYC;

default: DEFAULT DOSPUNTOS instrucciones;

print: PRINT PI CADENA (COMA argumentos)? PD PYC;

llamadaFuncion: NOMBRE PI argumentos? PD;

argumentos: expresion (COMA expresion)*;

declaracionFuncion: (STATIC | CONST)? (INT | DOUBLE | FLOAT | VOID | STRING) NOMBRE PI parametros? PD llaves;

parametros: (INT | DOUBLE | FLOAT) NOMBRE (COMA (INT | DOUBLE | FLOAT) NOMBRE)*;

return: RETURN (expresion | NUMERO)? PYC;

comentario: (COMENTARIO | COMENTARIO_MULTILINEA);