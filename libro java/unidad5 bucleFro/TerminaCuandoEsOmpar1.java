import java.util.Scanner;

public class TerminaCuandoEsOmpar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Dime un número de tu agrado: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("¡Que bonito es el: " + numero + "!");
            } else {
                System.out.println("No me gustan los números impares, adiós.");
            }
        } while (numero % 2 == 0);

        scanner.close();
    }
}
