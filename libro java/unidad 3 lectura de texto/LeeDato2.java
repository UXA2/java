import java.util.Scanner;
public class LeeDato2
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
    
        System.out.println("introduce tu nombre y tu edad separados por espacios");
        System.out.println("introduce el nombre de tus padres");
        String nombre = s.next();
        int edad = s.nextInt();
        String padres = s.next();
        System.out.println("tu nombre es " + nombre + "y tu edad " + edad + "el nombre de tus padres es :" + padres);
    }
}