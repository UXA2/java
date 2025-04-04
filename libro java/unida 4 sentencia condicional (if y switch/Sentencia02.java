public class Sentencia02 {
    public static void main(String[] args) {
        System.out.println("dame un numero entero");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);
        
        if (x < 0){
            System.out.println("el numero entero es negativo");
        }   else {
            System.out.println("el numero introducido es positivo");
        
        }
    }
}