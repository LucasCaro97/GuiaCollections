/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Alumno;
import java.util.Locale;
import java.util.Scanner;
import servicios.AlumnoServicio;

/**
 *
 * @author 54375
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String salida = "";
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoServicio alumnoservicio = new AlumnoServicio();
        
        do {
            
            Alumno alumno = alumnoservicio.crearAlumno();
            
            System.out.println("Desea agregar otro alumno? S/N");
            salida = entrada.next().toLowerCase();
            
        } while (!salida.equals("n"));
        
        alumnoservicio.mostrarAlumnos();
        alumnoservicio.obtenerPromedio();
        
        
        
    }
    
}
