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
public class Pricipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno alumno = new Alumno();
        boolean salir = true;
        int opc;

        while (salir) {
            System.out.println("------------------------");
            System.out.println("-1.Agregar alumno      -");
            System.out.println("-2.Mostrar alumno      -");
            System.out.println("-3.Calcular el promedio-");
            System.out.println("-4.Salir               -");
            System.out.println("------------------------");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1: 
                    ArrayList<Integer> notas = new ArrayList();
                    System.out.println("Ingrese nombre del Alumno: ");
                    String nombre = entrada.next();
                    
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingrese nota: ");
                        int nota = entrada.nextInt();
                        notas.add(nota);
                    }
                    alumno = new Alumno(nombre, notas);
                    alumnos.add(alumno);
                    break;
                    
                case 2: 
                    System.out.println("Lista de Alumnos");
                    for (Alumno elemento : alumnos) {
                        System.out.println(elemento.getNombre());
                        System.out.println(elemento.getNotas());
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese nombre del alumno:");
                    String busqueda = entrada.next();
                    boolean comprobador = false;
                    Iterator<Alumno> iterator = alumnos.iterator();
                    while(iterator.hasNext()){
                    Alumno alumno1 = iterator.next();
                        if (alumno1.getNombre().equals(busqueda)) {
                            System.out.println("El promedio es: " + alumno1.promedio());
                            comprobador = true;
                        }
                        
                    }
                    if (comprobador == false) {
                        System.out.println("No se encontro el alumno");
                    }
                    break;
                    
                case 4:
                    salir = false;
                    
            }

        }

    }

}
