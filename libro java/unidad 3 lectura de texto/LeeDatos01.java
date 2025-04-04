/*
 * lectura de datos desde teclado usando la clase Scanner
 */

//import java.util.Scanner se utiliza para importar la clase Scanner del paquete de java.utli
import java.util.Scanner;
 public class LeeDatos01{
    
    public static void main(String[] args) {

        // crear un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);
        
        // la funcion nextLine es un funcion de la clase Scanner y se utiliza para leer
        //una linea completa de entrada del usuario, incluyendo espacios en blanco
        System.out.println("introduce tu nombre :");
        String nombre = s.nextLine();
        

        System.out.println("introudce tu edad : ");
        int edad = Integer.parseInt(s.nextLine());

        System.out.println("tu domicilio es ");
        String domicilio = s.nextLine();

        System.out.println("tu nombre es " + nombre);
        System.out.println("tu edad es " + edad);
        System.out.println("tu domicilio es:" + domicilio);

    }
 }
