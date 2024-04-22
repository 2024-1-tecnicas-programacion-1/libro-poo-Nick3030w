package com.mycompany.libropoo;
import java.util.Scanner;
/**
 * Clase principal
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String titulo = lector.next();
        String autor = lector.next();
        String genero = lector.next();
        int anoPublicacion = lector.nextInt();
        Boolean leido = false;
        Libro libro = new Libro(titulo, autor, genero, anoPublicacion, leido);
        
        libro.marcarLeido();
        System.out.println(libro.mostrarInfo());
        System.out.println(libro.isLeido());
        libro.marcarLeido();
        System.out.println(libro.isLeido());
        System.out.println(libro.esAntiguo(anoPublicacion));
    }
    
}
