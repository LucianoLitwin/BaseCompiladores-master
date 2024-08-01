grammar compiladores;

/*@header {
package compiladores;
}*/

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS: [ \t\r\n]+ -> skip;

// Símbolos
PI: '(';
PD: ')';
LLAVEA: '{';
LLAVEC: '}';
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
RETURN: 'return';
BREAK: 'break';

// Aritmética y lógica
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

NOMBRE: (LETRA | '_')(LETRA | DIGITO | '_')*;
NUMERO: (DIGITO+ | DIGITO+ PUNTO DIGITO+);

programa: instrucciones;

tipo: VOID | DOUBLE | FLOAT | INT | STRING;

instrucciones: instruccion instrucciones
             | bloque instrucciones
             | ;

bloque: LLAVEA instrucciones LLAVEC;

instruccion: llaves
           | declaracion PYC
           | asignacion PYC
           | myIf
           | myFor
           | myWhile
           | declaracionFuncion
           | llamadaFuncion PYC
           | myReturn
           ;

expresion: termino expresion_continua;

expresion_continua: (MAS termino expresion_continua)
                  | (MENOS termino expresion_continua)
                  | ;

termino: factor termino_continua;

termino_continua: (MULTI factor termino_continua)
                | (DIVI factor termino_continua)
                | ;

factor: NOMBRE
      | NUMERO
      | llamadaFuncion
      | PI expresion PD
      ;

condicion: (NOMBRE | NUMERO | llamadaFuncion) condicion_continua;

condicion_continua: (COMPARE (NOMBRE | NUMERO | llamadaFuncion) condicion_continua)
                  | ;

llaves: LLAVEA instrucciones LLAVEC; // { ... }

declaracion: tipo NOMBRE declaracion_continua // int suma2=0;
           | tipo asignacion declaracion_continua //     int variable=3
           | tipo NOMBRE IGUAL factor //declarcion asignacion coma declaracion
           ;

declaracion_continua: COMA NOMBRE declaracion_continua
                    | COMA asignacion declaracion_continua
                    | ;

asignacion: NOMBRE IGUAL expresion; //variable = 3

myIf: IF PI condicion PD llaves (ELSE llaves)?;

expresionFor: asignacion PYC condicion PYC NOMBRE ACUM;

myFor: FOR PI expresionFor PD llaves;

myWhile: WHILE PI condicion PD llaves;


declaracionFuncion: tipo NOMBRE PI parametros? PD llaves;

llamadaFuncion: NOMBRE PI argumentos? PD;

argumentos: expresion argumentos_continua;

argumentos_continua: COMA expresion argumentos_continua
                    | ;

parametros: tipo NOMBRE parametros_continua;

parametros_continua: COMA tipo NOMBRE parametros_continua
                    | ;

myReturn: RETURN (expresion | NUMERO)? PYC;