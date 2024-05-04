/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author laort
 */
public class practica6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una figura: \n1. Circulo \n2. Rectangulo \n3. Cuadrado \n4. Triangulo ");
        int operacion = scanner.nextInt();
        scanner.nextLine();
        
        switch(operacion){
            case 1:
            System.out.println("Ingrese el color del circulo:");
            String colorCirculo = scanner.nextLine();
            System.out.println("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            circulo circulo = new circulo(colorCirculo, radio);
                System.out.println("Color: "+circulo.getColor());
            System.out.println("Radio: " + circulo.getRadio());
            System.out.println("Area: " + circulo.getArea());
            System.out.println("Perimetro: " + circulo.getPerimetro());
            break;
            case 2: 
                System.out.println("Ingrese el color del rectangulo:");
                String colorRectangulo = scanner.nextLine();
                System.out.println("Ingrese el largo del rectangulo: ");
                double largo = scanner.nextDouble();
                System.out.println("Ingrese el ancho del rectangulo: ");
                double ancho = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(colorRectangulo, largo, ancho);
                System.out.println("Color: "+rectangulo.getColor());
                System.out.println("Largo: " + rectangulo.getLargo());
                System.out.println("Ancho: " + rectangulo.getAncho());
                System.out.println("Area: " + rectangulo.getArea());
                System.out.println("Perimetro: " + rectangulo.getPerimetro());
            break;
            case 3: 
                System.out.println("Ingrese el color del cuadrado:");
                String colorCuadrado = scanner.nextLine();
                System.out.println("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                cuadrado cuadrado = new cuadrado(colorCuadrado, lado);
                System.out.println("Color: "+cuadrado.getColor());
                System.out.println("Lado: " + cuadrado.getLado());
                System.out.println("Area: " + cuadrado.getArea());
                System.out.println("Perimetro: " + cuadrado.getPerimetro());
            break;
            case 4: 
                System.out.println("Ingrese el color del triangulo:");
                String colorTriangulo = scanner.nextLine();
                System.out.println("Ingrese la base del triangulo: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Ingrese el lado1 del triangulo: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el lado2 del triangulo: ");
                double lado2 = scanner.nextDouble();
                System.out.println("Ingrese el lado 3 del triangulo: ");
                double lado3 = scanner.nextDouble();
                triangulo triangulo = new triangulo(colorTriangulo, altura, base, lado1, lado2, lado3);
                System.out.println("Color: " + triangulo.getColor());
                System.out.println("Altura: "+triangulo.getAltura());
                System.out.println("Base: "+triangulo.getBase());
                System.out.println("Lado1: "+triangulo.getLado1());
                System.out.println("Lado2: "+triangulo.getLado2());
                System.out.println("Lado3: "+triangulo.getLado3());
                System.out.println("Area: " + triangulo.getArea());
                System.out.println("Perimetro: " + triangulo.getPerimetro());
            break;
            default: System.out.println("La figura no esta en las opciones"); 
        }
        scanner.close();
    }
}
