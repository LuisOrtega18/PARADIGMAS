/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author laort
 */
public class cuadrado {
    
    private String color;
    private double lado;

    public cuadrado(String color, double lado) {
        this.color = color;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
       
    private double area() {
        return lado * lado;
    }

    private double perimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return area();
    }

    public double getPerimetro() {
        return perimetro();
    }

    public String getColor() {
        return color;
    }
}
