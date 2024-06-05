/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laort
 */
import java.lang.Math;

abstract class Figuras {
    String color;

    public Figuras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double perimetro();

    public abstract double area();
}


class Triangulo extends Figuras {
    double lado1, lado2, lado3;

    public Triangulo (String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}


class Circulo extends Figuras {
    double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}


class Rectangulo extends Figuras {
    double largo, ancho;

    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public double area() {
        return largo * ancho;
    }
}

class Hexagono extends Figuras {
    double lado;

    public Hexagono(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 6 * lado;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}


public class main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Azul", 6, 8, 9);
        Circulo circulo = new Circulo ("Amarillo", 6);
        Rectangulo rectangulo = new Rectangulo("Verde", 5, 8);
        Hexagono hexagono = new Hexagono("Naranja", 8);

        Figuras[] figuras = {triangulo, circulo, rectangulo, hexagono};

        for (Figuras figura : figuras) {
            System.out.println("Color: " + figura.getColor());
            System.out.println("Perimetro: " + figura.perimetro());
            System.out.println("Area: " + figura.area());
            System.out.println();
        }
        
    }
}
