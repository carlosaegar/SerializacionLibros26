/* Clases Libro
Escritor(recibe un ArrayList y una ruta de archivos
 Lector (Recibe un ArrayList y una ruta de archivo
 Main
    Alimenta Arraylist
    Llama al metodo correspondiente de
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String archivo = "libros.det";
        ArrayList<Libro> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String opcion;

        do {
            System.out.println("Escribe el titulo del libro: ");
            String titulo = sc.nextLine();

            System.out.println("Escribe el Autor del libro: ");
            String autor = sc.nextLine();

            System.out.println("Escribe el Año del libro: ");
            int anio = sc.nextInt();
            sc.nextLine();

            lista.add(new Libro(titulo,autor,anio));

            System.out.println("Seguir (s/n)");
            opcion= sc.nextLine();

        }while (opcion.equalsIgnoreCase("s"));

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        try{
            escritor.guardar(lista,archivo);
            System.out.println("Libros guardados");

            ArrayList<Libro> libros = lector.leer(archivo);
            System.out.println("Libros Leidos");

            for (Libro l: libros){
                System.out.println(l);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());

        }




    }

}
