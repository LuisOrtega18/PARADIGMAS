/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author laort
 */
public class circulo {

    private String color;
    private double radio;

    public circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    private double area() {
        return Math.PI * radio * radio;
    }

    private double perimetro() {
        return 2 * Math.PI * radio;
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
