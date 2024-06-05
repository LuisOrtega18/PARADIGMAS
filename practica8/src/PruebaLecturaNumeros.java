/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laort
 */
import java.io.IOException;

public class PruebaLecturaNumeros {
    public static void main(String[] args) {
        try (LecturaNumeros lector = new LecturaNumeros()) {
            int num1 = lector.readInt("Ingrese un numero entero: \n");
            int num2 = lector.readInt("Ingrese otro numero entero: \n");
            System.out.println("Ingrese un numero:");
            Integer num3 = lector.readInteger();
            double num4 = lector.readDouble("Ingrese un numero decimal: \n");
            double num5 = lector.readDouble("Ingrese otro numero decimal: \n");

            System.out.println("\nNúmeros ingresados:");
            System.out.println("Entero 1: " + num1);
            System.out.println("Entero 2: " + num2);
            System.out.println("Integer : " + num3);
            System.out.println("Double 1: " + num4);
            System.out.println("Double 2: " + num5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
