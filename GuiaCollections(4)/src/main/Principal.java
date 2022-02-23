/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Pelicula;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import servicios.ServicioPelicula;

/**
 *
 * @author 54375
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String salida = "";
        ServicioPelicula serviciopeli = new ServicioPelicula();

        do {

            Pelicula pelicula = serviciopeli.crearPelicula();
            System.out.println("Desea agregar otra pelicula?");
            salida = entrada.next();

        } while (!salida.equals("n"));

        System.out.println("Todas las peliculas");
        serviciopeli.mostrarPeliculas();
        System.out.println("Peliculas mayores a 1 hora");
        serviciopeli.mostrarPeliculasMayores1Hora();

        System.out.println("---   Lista Ordenada Por Duracion Desc   ---");
        Collections.sort(serviciopeli.getListapeliculas());
        serviciopeli.mostrarPeliculas();
        
        System.out.println("---   Lista Ordenada Por Duracion Asc   ---");
        Collections.reverse(serviciopeli.getListapeliculas());
        serviciopeli.mostrarPeliculas();
        
        System.out.println("---   Lista Ordenada Por Titulo Alfabeticamente   ---");
        serviciopeli.ordenarPorTituloAsc();
        serviciopeli.mostrarPeliculas();
        
        System.out.println("---   Lista Ordenada Por Director Alfabeticamente   ---");
        serviciopeli.ordenarPorDirector();
        serviciopeli.mostrarPeliculas();
        

    }

}
