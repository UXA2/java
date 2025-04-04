public class Operadores01 {
    public static void main(String[] args) {
        System.out.println("adivina el numero que estoy pensando");
        System.out.println("introduce un numero del 1 al 100");
        String linea = System.console().readLine();
        int n = Integer.parseInt(linea);

        if ((n < 1) || ( n > 100)){
            System.out.println("el numero introducido dede estar en el intervalo 1 - 100");
            System.out.println("tienes la oportunidad, introduzca un numero");
            n = Integer.parseInt(linea);
        }

        if (n==24){
            System.out.println("!en hora nuena¡, !has acertado¡");
        }else{
            System.out.println("lo siento, no es el mismo numero que estoy pensando");
        }
    }
}
