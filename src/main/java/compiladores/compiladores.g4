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
CADENA: '"' (~["\\] | '\\' .)* '"';
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
STRING: 'string'; 

NOMBRE: (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO: (DIGITO+ | DIGITO+ PUNTO DIGITO+) ;

// Start Rule
programa: (declaracionFuncion | instrucciones) EOF;

tipo: VOID |DOUBLE|FLOAT|INT|STRING;

instrucciones: instruccion*;

instruccion: llaves
            | declaracion
            | asignacion
            | myIf
            | myFor
            | myWhile
            | mySwitch
            | declaracionFuncion
            | llamadaFuncion PYC
            | myReturn
            | myBreak
            ;

expresion: (NOMBRE | NUMERO | llamadaFuncion) ((MAS | MENOS | MULTI | DIVI | ANDOR) (NOMBRE | NUMERO | llamadaFuncion))*;

condicion: (NOMBRE | NUMERO | llamadaFuncion) (COMPARE (NOMBRE | NUMERO | llamadaFuncion))*;

llaves: LI instrucciones LD;

// Modificación en la regla de declaración para permitir múltiples variables
declaracion:  tipo NOMBRE declaracion_continua PYC
            |  tipo asignacion declaracion_continua
            ;

declaracion_continua: COMA NOMBRE declaracion_continua
                    |
                    ;

asignacion: NOMBRE IGUAL (expresion | NUMERO) PYC;


myIf: IF PI condicion PD llaves (ELSE llaves)?;

expresionFor: INT asignacion condicion PYC NOMBRE ACUM;

myFor: FOR PI expresionFor PD llaves;

myWhile: WHILE PI condicion PD llaves;

mySwitch: SWITCH PI expresion PD bloqueSwitch;

bloqueSwitch: LI myCase LD;

myCase: CASE expresion DOSPUNTOS instrucciones myCase
      | default
      | 
      ;

myBreak: BREAK PYC;

default: DEFAULT DOSPUNTOS instrucciones;


llamadaFuncion: NOMBRE PI argumentos? PD;

argumentos: expresion argumentos_continuos;

argumentos_continuos: COMA expresion argumentos_continuos
                    |
                    ;

declaracionFuncion: tipo NOMBRE PI parametros? PD llaves;

parametros: tipo NOMBRE parametros_continuos;

parametros_continuos: COMA tipo NOMBRE parametros_continuos
                    |
                    ;


myReturn: RETURN (expresion | NUMERO)? PYC;

