/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

/**
 *
 * @author laort
 */

    

public class Rectangulo {
    private String color;
    private double largo;
    private double ancho;

    public Rectangulo(String color, double largo, double ancho) {
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    
    private double area() {
        return largo * ancho;
    }

    private double perimetro() {
        return 2 * (largo + ancho);
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




    
