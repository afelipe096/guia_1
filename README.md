# Proyecto Guía 1 - Clase Estudiante

## Descripción del Proyecto
Programa básico en Java que gestiona información de estudiantes usando una clase llamada `Estudiante`. El programa crea dos objetos de esta clase y utiliza métodos para mostrar información, calcular promedios y validar edades.

## Cambios Realizados

### 1. Nuevo Método Agregado: `validarMayorEdad()`
- **Descripción:** Método que valida si un estudiante es mayor de edad (≥18 años)
- **Funcionamiento:** Compara la edad del estudiante con 18 años e imprime un mensaje indicando si es mayor o menor de edad
- **Ubicación:** Clase `Estudiante`

### 2. Segundo Objeto Creado
- **Objeto 1 (est1):** Estudiante con nombre "Juan" de 18 años
- **Objeto 2 (est2):** Estudiante con nombre "María" de 20 años
- Ambos objetos utilizan los métodos disponibles en la clase

### 3. Métodos de la Clase Estudiante
1. `mostrarInfo()` - Muestra el nombre y edad del estudiante
2. `calcularPromedio()` - Calcula el promedio de dos notas
3. `validarMayorEdad()` - Valida si el estudiante es mayor de edad (NUEVO)

## Dificultades Encontradas y Soluciones

### Dificultad 1: Estructura del Código
- **Problema:** Entender cómo organizar los métodos dentro de la clase
- **Solución:** Se agregó el nuevo método siguiendo la misma estructura que los métodos existentes, manteniendo la claridad con comentarios

### Dificultad 2: Lógica del Método de Validación
- **Problema:** Implementar una condición simple y clara
- **Solución:** Se utilizó un condicional `if-else` básico para comparar la edad con 18 años, lo que es una estructura de control fácil de entender

## Cómo Ejecutar el Programa
1. Compilar el archivo: `javac guia1.java`
2. Ejecutar el programa: `java Main`

## Reflexión
Este proyecto permitió practicar conceptos básicos de programación orientada a objetos como la creación de clases, constructores, múltiples objetos y métodos. El proceso fue sencillo y ayudó a comprender cómo los métodos pueden realizar diferentes operaciones sobre los datos de un objeto. La adición del método de validación mostró cómo se puede implementar lógica condicional dentro de una clase de forma simple.