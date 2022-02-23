/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public Alumno() {
    }

    
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }


    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    
    public double promedio(){
        int prom = 0;
        Iterator<Integer> iterator = this.notas.iterator();
        while(iterator.hasNext()){
            Integer nota2 = iterator.next();
            prom = prom + nota2;
        }
        return prom/3;
    }
}
