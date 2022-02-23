/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.

 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Principal {

    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String salida = "s";
        String raza;
        ArrayList <String> arrayRaza = new ArrayList();
        
        do {
            System.out.println("Ingrese una raza de perro: ");
            raza = entrada.next();
            arrayRaza.add(raza);
            System.out.println("Desea agregar otra raza? S(Si)/N(no)");
            salida = entrada.next().toLowerCase();
            
        } while (salida.equals("s"));
        
        System.out.println("FOR NORMAL");
        for (int i = 0; i < arrayRaza.size(); i++) {
            System.out.println("Raza: " + arrayRaza.get(i));
        }
        
        System.out.println("FOR EACH");
        for (String element : arrayRaza) {
            System.out.println("Raza: " + element);
        }
        
    }
    
}
