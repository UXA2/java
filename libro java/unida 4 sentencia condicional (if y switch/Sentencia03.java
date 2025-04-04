public class Sentencia03 {
    public static void main(String[] args) {
        System.out.println("que nota has sacado en el ultimo examen?");
        String line = System.console().readLine();
        double nota = Double.parseDouble(line);

        if (nota >= 5){
       System.out.println("has aprobado tu examen!!!!");
        } else {
            System.out.println("has reprobado.");
        }
    }
}
