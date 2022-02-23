/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package main;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Principal {

    public static void main(String[] args) {

        String salida = "";
        int menu = 0;
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap<String, Double> mapaProductos = new HashMap();


        do {
            System.out.println("------ MENU ------");
            System.out.println("1- Agregar un producto");
            System.out.println("2- Modificar un producto");
            System.out.println("3- Eliminar un producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- Salir");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Ingrese el nombre del prod: ");
                    String producto = entrada.next();
                    System.out.println("Ingrese el precio del prod: ");
                    double precio = entrada.nextDouble();
                    mapaProductos.put(producto, precio);
                    break;
                case 2:
                    System.out.println("Ingrese el producto a modificar: ");
                    String productomodifica = entrada.next();
                    if (mapaProductos.containsKey(productomodifica)) {
                        System.out.println("Ingrese nuevo precio: ");
                        double nuevoprecio = entrada.nextDouble();
                        mapaProductos.replace(productomodifica, nuevoprecio);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a eliminar: ");
                    String productoelimina = entrada.next();
                    mapaProductos.remove(productoelimina);
                    break;
                case 4:
                    for (Map.Entry<String, Double> aux : mapaProductos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("Producto: " + key);
                        System.out.println("Precio: " + value);
                    }
                    break;
                case 5:
                salida = "s";    

            }

        } while (!salida.equals("s"));

    }

}
