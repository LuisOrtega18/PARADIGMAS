/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author laort
 */
import java.util.Scanner;

public class CalculadoraCientifica {

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public static double seno(double a) {
        return Math.sin(a);
    }

    public static double coseno(double a) {
        return Math.cos(a);
    }

    public static double tangente(double a) {
        return Math.tan(a);
    }
    
    public static double factorial(double n) {
    if (n < 0) {
        throw new ArithmeticException("El factorial no está definido para numeros negativos.");
    }
    double resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Cientifica");
        System.out.println("Operaciones disponibles: suma, resta, multiplicacion, division, potencia, raiz cuadrada, seno, coseno, tangente, factorial");
        System.out.print("Ingrese la operacion: ");
        String operacion = scanner.next();

        double a, b;
        switch (operacion) {
            case "suma":
                System.out.print("Ingrese el primer numero: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + suma(a, b));
                break;
            case "resta":
                System.out.print("Ingrese el primer numero: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + resta(a, b));
                break;
            case "multiplicacion":
                System.out.print("Ingrese el primer numero: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + multiplicacion(a, b));
                break;
            case "division":
                System.out.print("Ingrese el numerador: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el denominador: ");
                b = scanner.nextDouble();
                try {
                    System.out.println("Resultado: " + division(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case "potencia":
                System.out.print("Ingrese la base: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el exponente: ");
                b = scanner.nextDouble();
                System.out.println("Resultado: " + potencia(a, b));
                break;
            case "raizcuadrada":
                System.out.print("Ingrese el numero: ");
                a = scanner.nextDouble();
                System.out.println("Resultado: " + raizCuadrada(a));
                break;
            case "seno":
                System.out.print("Ingrese el angulo (en radianes): ");
                a = scanner.nextDouble();
                System.out.println("Resultado: " + seno(a));
                break;
            case "coseno":
                System.out.print("Ingrese el angulo (en radianes): ");
                a = scanner.nextDouble();
                System.out.println("Resultado: " + coseno(a));
                break;
            case "tangente":
                System.out.print("Ingrese el angulo (en radianes): ");
                a = scanner.nextDouble();
                System.out.println("Resultado: " + tangente(a));
                break;
            case "factorial":
                System.out.print("Ingrese el numero: ");
                a = scanner.nextDouble();
                try {
                    System.out.println("Resultado: " + factorial(a));
                    } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    }
                break;
            default:
                System.out.println("Operacion no reconocida.");
                break;
        }

        scanner.close();
    }
}


    