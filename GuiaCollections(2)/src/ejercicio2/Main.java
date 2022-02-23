/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String salida = "s";
        String raza;
        ArrayList<String> arrayRaza = new ArrayList();
        boolean bandera = false;

        do {
            System.out.println("Ingrese una raza de perro: ");
            raza = entrada.next();
            arrayRaza.add(raza);
            System.out.println("Desea agregar otra raza? S(Si)/N(no)");
            salida = entrada.next().toLowerCase();

        } while (salida.equals("s"));

//        System.out.println("FOR NORMAL");
//        for (int i = 0; i < arrayRaza.size(); i++) {
//            System.out.println("Raza: " + arrayRaza.get(i));
//        }
//
//        System.out.println("FOR EACH");
//        for (String element : arrayRaza) {
//            System.out.println("Raza: " + element);
//        }
        System.out.println("ITERATOR");
        Iterator<String> iterator = arrayRaza.iterator();
        while (iterator.hasNext()) {
            System.out.println("Raza: " + iterator.next());
        }

        System.out.println("Ingrese una raza que desee eliminar: ");
        raza = entrada.next();

        iterator = arrayRaza.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(raza)) {
                iterator.remove();
                bandera = true;
            }

        }

        Collections.sort(arrayRaza);
        if (bandera) {
            System.out.println("Se elimino con exito la raza");
            for (String element : arrayRaza) {
                System.out.println("Raza: " + element);
            }

        } else {
            System.out.println("La raza no se encontro en la lista");
            for (String element : arrayRaza) {
                System.out.println("Raza: " + element);
            }
        }

    }

}
