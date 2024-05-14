/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3D;

/**
 *
 * @author laort
 */
public class TestPunto3D {
    public static void main(String[] args) {
        Punto3D[] puntos = new Punto3D[10];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto3D(Math.random() * 100, Math.random() * 100, Math.random() * 100);
        }

        double distanciaMinima = Double.MAX_VALUE;
        System.out.println("Distancias entre los puntos:");

        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                double distancia = puntos[i].distancia(puntos[j]);
                System.out.printf("Distancia entre punto %d y punto %d es: %.2f\n", i, j, distancia);
                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                }
            }
        }

        System.out.println("\nLa menor distancia encontrada es: " + distanciaMinima);
    }
}
