public class Sentencia {
    public static void main(String[] args) {
        System.out.println("dame 5 municipios de veracruz");
        String respuestas = System.console().readLine();
        

        if (respuestas.equals("cabada, catemaco, san andres, santiago, la victoria")){
            System.out.println("la respuestas es correcta");
        }   else {
            System.out.println("la respuesta es incorrecta");
        
        }
    }
}