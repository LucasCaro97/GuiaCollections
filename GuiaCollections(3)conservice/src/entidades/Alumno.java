/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 54375
 */
public class Alumno {
    
    private String nombre;
    public ArrayList<Integer> notas;

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

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public double notaFinal(){
        double acu = 0;
        Iterator<Integer> iterator = notas.iterator();
        while(iterator.hasNext()){
            int nota = iterator.next();
            acu = acu + nota;
        }   
        
        return acu / 3;
        
    }
            
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
}
