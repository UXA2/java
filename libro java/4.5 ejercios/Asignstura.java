//escrbe un programa que pida por teclado un dia de la semana y que dija
//que asignatura toca a primera hora de ese dia
import java.util.Scanner;

public class  Asignstura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el día de la semana
        System.out.println("Introduce un día de la semana (lunes, martes, miércoles, jueves, viernes):");
        String dia = scanner.nextLine().toLowerCase();

        // Determinar la asignatura correspondiente
        String asignatura;
        switch (dia) {
            case "lunes":
                asignatura = "Matemáticas";
                break;
            case "martes":
                asignatura = "Física";
                break;
            case "miércoles":
                asignatura = "Química";
                break;
            case "jueves":
                asignatura = "Historia";
                break;
            case "viernes":
                asignatura = "Inglés";
                break;
            default:
                asignatura = "Día no válido, por favor introduce un día entre lunes y viernes.";
                break;
        }

        // Mostrar la asignatura
        System.out.println("A primera hora toca: " + asignatura);
    }
}
