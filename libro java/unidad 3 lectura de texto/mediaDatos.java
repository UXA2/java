import java.util.Scanner;
public class mediaDatos {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("introduce tres numeros (pueden contener decimales) separados por espacios ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();

        double media = (x1 + x2 + x3) /3;
        System.out.println("la media de eso tres numeros es " + media);
    }
}
