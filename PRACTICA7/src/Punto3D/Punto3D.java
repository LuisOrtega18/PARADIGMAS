/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto3D;

/**
 *
 * @author laort
 */
public class Punto3D {
    private double x, y, z;

    // Constructor por defecto que inicializa con valores predeterminados
    public Punto3D() {
        this(0, 0, 0);  // Llama al constructor con parámetros
    }

    // Constructor con parámetros
    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Constructor que recibe un objeto Punto3D
    public Punto3D(Punto3D otro) {
        this(otro.x, otro.y, otro.z);
    }

    // Métodos getter y setter para x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Métodos getter y setter para y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Métodos getter y setter para z
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Método que calcula la distancia Euclidiana
    public double distancia(Punto3D otro) {
        return Math.sqrt(Math.pow(this.x - otro.x, 2) +
                         Math.pow(this.y - otro.y, 2) +
                         Math.pow(this.z - otro.z, 2));
    }
}
