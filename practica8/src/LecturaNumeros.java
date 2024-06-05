/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laort
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    public LecturaNumeros(Reader r) {
        super(r);
    }

    public int readInt() throws IOException {
        return Integer.parseInt(readLine().trim());
    }

    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInt();
    }

    public Integer readInteger() throws IOException {
        return Integer.valueOf(readLine().trim());
    }

    public double readDouble() throws IOException {
        return Double.parseDouble(readLine().trim());
    }

    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readDouble();
    }
    
}

