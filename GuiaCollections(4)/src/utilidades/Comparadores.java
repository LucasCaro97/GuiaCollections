/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author 54375
 */
public class Comparadores {

    public static Comparator<Pelicula> comparePorDurDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli2.getTitulo().compareTo(peli1.getTitulo());
        }
    };
    
        public static Comparator<Pelicula> comparePorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli1.getTitulo().compareTo(peli2.getTitulo());
        }
    };
        
        public static Comparator<Pelicula> comparePorDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli1.getDirector().compareTo(peli2.getDirector());
        }
    };

//    public static Comparator<Pelicula> compararPorDuracionAsc = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Pelicula p1, Pelicula p2) {
//            return p1.getDuracion().compareTo(p2.getDuracion());
//        }
//
//    };

   

   
}
