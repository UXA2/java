public class TerminaCuantoEsImpar {
    public static void main(String[] args) {
        int numero;

        //BUCLES

        do {
            System.out.println("Dime un numero: ");
            numero = Integer.parseInt(System.console().readLine());
         if (numero %2 ==0){ //comprueba si el numero introducido es par
                System.out.println("Que bonito es el " + numero);

            } else {
                System.out.println("No me gusta los numeros impares, adios");

            }
         }while (numero % 2 ==0); //evalua si el residuo de dividir el numero entre dos o igual a 0
                
            
        }
    }

