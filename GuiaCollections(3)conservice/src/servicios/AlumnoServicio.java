/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author 54375
 */
public class AlumnoServicio {
    
    private Scanner entrada;
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        this.alumnos = new ArrayList();
    }
    
    public Alumno crearAlumno(){
        ArrayList<Integer> notas = new ArrayList();
        
        System.out.println("Ingrese nombre:");
        String nomb = entrada.next();
        for (int i = 0; i < 3; i++) {
            
        System.out.println("Ingresar nota [" + (i + 1) + "]" );
        int nota = entrada.nextInt();
        notas.add(nota);
        
        }
        
        Alumno alumno = new Alumno(nomb,notas);
        
        alumnos.add(alumno);
        return alumno;
        
        
    }
    
    public void mostrarAlumnos(){
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
        
    }
    
    public void obtenerPromedio(){
        double prom = 0;
        System.out.println("Ingrese el nombre del alumno: ");
        String nomb = entrada.next();
        Iterator<Alumno> iterator = alumnos.iterator();
        while(iterator.hasNext()){
            Alumno alumnobuscado = iterator.next();
            if (alumnobuscado.getNombre().equals(nomb)) {
                System.out.println("Alumno encontrado: " + alumnobuscado.getNombre() + ". Promedio general: " + alumnobuscado.notaFinal());
            }else{
                System.out.println("El alumno no se encuentra en la lista");
            }
            
            
        }
        
    }

    @Override
    public String toString() {
        return "AlumnoServicio{" + "alumnos=" + alumnos + '}';
    }
    
    
}
