import java.util.Scanner;
import java.util.Random;

public class guia1 {
    // Materias disponibles
    static String[] materias = {"Matemáticas", "Inglés", "Programación", "Física", "Historia", "Química"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("REGISTRO DE ESTUDIANTES \n");

        // Primer Estudiante
        System.out.println("ESTUDIANTE 1 ");
        System.out.print("Ingresa el nombre del estudiante 1: ");
        String nombre1 = scanner.nextLine();
        
        System.out.print("Ingresa la edad: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        
        Estudiante est1 = new Estudiante(nombre1, edad1);
        est1.mostrarInfo();
        est1.validarMayorEdad();
        
        String materiaAleatoria1 = obtenerMateriaAleatoria();
        est1.asignarMateria(materiaAleatoria1);
        
        System.out.print("Ingresa la primera nota: ");
        double nota1_1 = scanner.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota1_2 = scanner.nextDouble();
        est1.calcularPromedio(nota1_1, nota1_2);
        est1.verificarEstado();

        System.out.println("\n\n");

        // Segundo Estudiante
        System.out.println("ESTUDIANTE 2 ");
        System.out.print("Ingresa el nombre del estudiante 2: ");
        scanner.nextLine(); // Limpia el buffer
        String nombre2 = scanner.nextLine();
        
        System.out.print("Ingresa la edad: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        
        Estudiante est2 = new Estudiante(nombre2, edad2);
        est2.mostrarInfo();
        est2.validarMayorEdad();
        
        String materiaAleatoria2 = obtenerMateriaAleatoria();
        est2.asignarMateria(materiaAleatoria2);
        
        System.out.print("Ingresa la primera nota: ");
        double nota2_1 = scanner.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota2_2 = scanner.nextDouble();
        est2.calcularPromedio(nota2_1, nota2_2);
        est2.verificarEstado();

        scanner.close();
    }
    
    // Método para obtener una materia aleatoria
    static String obtenerMateriaAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(materias.length);
        return materias[indice];
    }
}

// Clase Estudiante
class Estudiante {
    String nombre;
    int edad;
    String materia;
    double promedio;

    // Constructor
    Estudiante(String n, int e) {
        nombre = n;
        edad = e;
        materia = "";
        promedio = 0.0;
    }

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Método para calcular promedio
    void calcularPromedio(double nota1, double nota2) {
        promedio = (nota1 + nota2) / 2.0;
        System.out.println("Promedio de " + nombre + ": " + promedio);
    }

    // Método para validar si es mayor de edad
    void validarMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

    //metodo para asignar materia
    void asignarMateria(String m) {
        materia = m;
        System.out.println(nombre + " ha sido asignado a la materia: " + materia);
    }

    // Método para mostrar la materia asignada
    void mostrarMateria() {
        System.out.println("Materia de " + nombre + ": " + materia);
    }

    // Método para verificar si pasó o perdió la materia
    void verificarEstado() {
        if (promedio >= 3.0) {
            System.out.println(nombre + " PASÓ la materia " + materia + " con promedio: " + promedio);
        } else {
            System.out.println(nombre + " PERDIÓ la materia " + materia + " con promedio: " + promedio);
        }
    }
    
}