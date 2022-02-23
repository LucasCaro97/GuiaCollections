/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String salida = "";
        HashSet<String> paises = new HashSet();

        do {
            System.out.println("Ingrese un pais");
            String pais = entrada.next();
            paises.add(pais);
            System.out.println("Desea agregar otro pais?");
            salida = entrada.next();
        } while (!salida.equals("n"));

        //FOR EACH
        for (String aux : paises) {
            System.out.println(aux);
        }

        System.out.println("PAISES ORDENADOS ALFABETICAMENTE");
        ArrayList<String> Arraypaises = new ArrayList(paises);
        Collections.sort(Arraypaises);
        for (String aux : Arraypaises) {
            System.out.println(aux);
        }

        boolean bandera = false;
        System.out.println("Ingrese un pais que desee eliminar: ");
        String paiseliminar = entrada.next();

        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(paiseliminar)) {
                iterator.remove();
                bandera = true;
            }

        }
        if (bandera) {
            System.out.println("Se elimino el pais con exito");
        } else {
            System.out.println("El pais no se encuentra en la lista");
        }

        for (String aux : paises) {
            System.out.println(aux);
        }
    }

}
