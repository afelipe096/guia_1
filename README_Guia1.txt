================================================================================
GUÍA 1 - TALLER DE PROGRAMACIÓN 2026-261
================================================================================

ESTUDIANTE: Andres Felipe Currea Piratova
CÓDIGO: 1031166647
PROYECTO: TP2026-261_CurreaAndres_Guia1
FECHA: 09/02/2026

--------------------------------------------------------------------------------
1. DESCRIPCIÓN DEL PROYECTO
--------------------------------------------------------------------------------
Este proyecto configura un entorno de desarrollo en GITHUB con programación orientada a
objetos en Java. Contiene la clase Estudiante con atributos (nombre, edad,
materia, promedio) y métodos para mostrar información, calcular promedio,
validar mayoría de edad y determinar si el estudiante pasó o perdió la materia.
El programa es INTERACTIVO: solicita al usuario los datos de dos estudiantes
(nombre, edad, dos notas), asigna aleatoriamente una materia de una lista
predefinida, y muestra el resultado incluyendo si aprobó o no la materia.

--------------------------------------------------------------------------------
2. CAMBIOS REALIZADOS EN TRABAJO AUTÓNOMO
--------------------------------------------------------------------------------
Durante el trabajo autónomo realicé los siguientes cambios:

a) Segundo objeto Estudiante:
   - Crear dos objetos de la clase Estudiante con datos diferentes
   - Estudiante 1 y Estudiante 2 con sus propias características

b) Nuevo método validarMayorEdad():
   - Verifica si el estudiante es mayor o menor de edad (>= 18)
   - Muestra un mensaje indicando el resultado
   - Se implementó en ambos objetos

c) Nuevo método verificarEstado():
   - Determina si el estudiante pasó o perdió la materia
   - Criterio: Promedio >= 3.0 = PASÓ, < 3.0 = PERDIÓ
   - Muestra el resultado con el nombre de la materia y promedio

d) Materias predefinidas y asignación aleatoria:
   - Creé un array estático con 6 materias: Matemáticas, Inglés, 
     Programación, Física, Historia, Química
   - Implementé el método obtenerMateriaAleatoria() usando clase Random
   - Cada estudiante recibe una materia asignada aleatoriamente

e) Programa interactivo con entrada de datos:
   - Implementé Scanner para entrada de datos del usuario
   - El usuario ingresa: nombre, edad y dos notas para cada estudiante
   - Eliminé datos hardcodeados, ahora todo se captura interactivamente
   - Mejoré la presentación con mensajes claros y separadores visuales

f) Variable promedio:
   - Agregué variable double promedio en la clase Estudiante
   - El método calcularPromedio() ahora almacena el valor
   - Permite usar el promedio en otros métodos (verificarEstado)

--------------------------------------------------------------------------------
3. DIFICULTADES ENCONTRADAS Y SOLUCIONES
--------------------------------------------------------------------------------
Problema 1: Constructor con número incorrecto de parámetros
Solución: Ajusté el constructor para recibir solo nombre y edad, luego 
inicializar materia y promedio con valores vacíos

Problema 2: Confusión entre entrada manual y asignación aleatoria
Solución: Implementé método obtenerMateriaAleatoria() 

Problema 3: Necesidad de guardar el promedio para usarlo después
Solución: Convertí "prom" variable local a "promedio" variable de instancia

Problema 4: Lógica del promedio para determinar aprobación
Solución: Investigué que en Colombia el promedio mínimo es 3.0, así que 
implementé ese criterio en el método verificarEstado()

Problema 5: Buffer del Scanner no limpiado correctamente
Solución: Agregué scanner.nextLine() después de nextInt() y nextDouble() 
para evitar problemas con la lectura de strings

--------------------------------------------------------------------------------
4. MÉTODOS DE LA CLASE ESTUDIANTE
--------------------------------------------------------------------------------
1. Constructor Estudiante(String n, int e)
   - Inicializa: nombre, edad, materia vacía y promedio 0.0

2. mostrarInfo()
   - Muestra: Nombre y Edad del estudiante

3. calcularPromedio(double nota1, double nota2)
   - Calcula el promedio: (nota1 + nota2) / 2.0
   - Almacena en variable promedio
   - Muestra el resultado

4. validarMayorEdad()
   - Verifica si edad >= 18
   - Imprime si es mayor o menor de edad

5. asignarMateria(String m)
   - Recibe una materia como parámetro
   - La asigna al estudiante
   - Muestra mensaje de confirmación

6. mostrarMateria()
   - Muestra la materia asignada al estudiante

7. verificarEstado()
   - Verifica si promedio >= 3.0 (PASÓ) o < 3.0 (PERDIÓ)
   - Muestra el resultado con nombre de materia y promedio

--------------------------------------------------------------------------------
5. SALIDA ESPERADA EN CONSOLA
--------------------------------------------------------------------------------
REGISTRO DE ESTUDIANTES 

ESTUDIANTE 1 
Ingresa el nombre del estudiante 1: Carlos
Ingresa la edad: 19
Ingresa la primera nota: 4.5
Ingresa la segunda nota: 4.8
Nombre: Carlos, Edad: 19
Carlos es mayor de edad.
Carlos ha sido asignado a la materia: Programación
Promedio de Carlos: 4.65
Carlos PASÓ la materia Programación con promedio: 4.65

 ESTUDIANTE 2 
Ingresa el nombre del estudiante 2: Ana
Ingresa la edad: 17
Ingresa la primera nota: 2.8
Ingresa la segunda nota: 3.0
Nombre: Ana, Edad: 17
Ana es menor de edad.
Ana ha sido asignado a la materia: Matemáticas
Promedio de Ana: 2.9
Ana PERDIÓ la materia Matemáticas con promedio: 2.9



--------------------------------------------------------------------------------
6. CARACTERÍSTICAS PRINCIPALES
--------------------------------------------------------------------------------
✓ Entrada interactiva de datos (Scanner)
✓ Materias asignadas aleatoriamente (Random)
✓ Dos objetos Estudiante con datos diferentes
✓ Múltiples métodos con diferentes funcionalidades
✓ Validación de mayoría de edad
✓ Cálculo y almacenamiento de promedio
✓ Determinación de aprobación/pérdida de materia
✓ Código sin errores de compilación
✓ Presentation clara con mensajes informativos

--------------------------------------------------------------------------------
7. CÓMO EJECUTAR EL PROGRAMA
--------------------------------------------------------------------------------
1. Compilar: javac guia1.java
2. Ejecutar: java guia1
3. Ingresar datos cuando el programa lo solicite
4. Ver resultados en consola

================================================================================
NOTA: Este proyecto cumple con todos los requisitos de la Guía 1 (5% de la nota)
================================================================================
