/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author 54375
 */
public class ServicioPelicula {
    
    private Scanner entrada;
    private ArrayList<Pelicula> listapeliculas;

    public ServicioPelicula() {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.listapeliculas = new ArrayList();
    }
    
    /*
    crea un objeto Pelicula pidiéndole al usuario todos sus datos 
    y los guarda en el objeto pelicula y en la listapeliculas.
    */
    public Pelicula crearPelicula(){
        
        System.out.println("Ingrese el titulo:");
        String titulo = entrada.next();
        System.out.println("Ingrese el director:");
        String director = entrada.next();
        System.out.println("Ingrese la duracion:");
        double duracion = entrada.nextDouble();
        
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        listapeliculas.add(pelicula);
        return pelicula;
        
    }
    
    public void mostrarPeliculas(){
        for (Pelicula aux : listapeliculas) {
            System.out.println(aux);
        }
        
    }
    
    public void mostrarPeliculasMayores1Hora(){
        Iterator<Pelicula> iterator = listapeliculas.iterator();
        while(iterator.hasNext()){
            Pelicula pelicula = iterator.next();
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }
    
    public void ordenarPorTituloAsc(){
        Collections.sort(listapeliculas, Comparadores.comparePorTituloAsc);
    }

    public void ordenarPorDirector(){
        Collections.sort(listapeliculas, Comparadores.comparePorTituloAsc);
    }
    
    @Override
    public String toString() {
        return "ServicioPelicula{" + "listapeliculas=" + listapeliculas + '}';
    }

    public ArrayList<Pelicula> getListapeliculas() {
        return listapeliculas;
    }

    public void setListapeliculas(ArrayList<Pelicula> listapeliculas) {
        this.listapeliculas = listapeliculas;
    }
    

}
