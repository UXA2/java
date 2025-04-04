public class CuentaPositivos {
    public static void main(String[] args) {
        System.out.println("Por favor, vaya introducido numeros y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un numero negativo.");

        int numeroIntroducido = 0;
        int cuentaNumeros = 0;
        int suma = 0;

        while (numeroIntroducido >=0){ //Este bucle continuará ejecutándose mientras la variable
            numeroIntroducido = Integer.parseInt(System.console().readLine()); //Esta línea está esperando que el usuario escriba algo en la consola.//Es un método que captura la entrada como texto desde el teclado.
            cuentaNumeros++; //incrementa en uno la variable
            suma += numeroIntroducido; //Equivalente a suma = suma + numeroIntroducido
        }
            System.out.println("Has introducido " + (cuentaNumeros - 1) + " numeros positivos.");
            System.out.println("la suma total de ellos es " + (suma - numeroIntroducido));

        }
    }
