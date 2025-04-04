public class MenuConSwitch {
    public static void main(String[] args) {
        System.out.println(" CALCULO DE AREAS ");
        System.out.println(" --------- ");
        System.out.println(" 1. Cuadrado");
        System.out.println(" 2. Rectangulo");
        System.out.println(" 3. Triangulo");
        System.out.println(" 4. Rectangulo");
        System.out.println("\n Elija una opcion (1-4): ");

        int opcion = Integer.parseInt(System.console().readLine());
        double lado;
        double base;
        double altura;
        

        switch (opcion){
            case 1:
            System.out.println(" introduzca el aldo del cuadrado en cm: ");
            lado = Double.parseDouble(System.console().readLine());
            System.out.println("\nEl area del cuadrado es " + (lado * lado) + " cm2");
            break;

            case 2:
            System.out.println(" introduzca la base del rectangulo es cm: ");
            base = Double.parseDouble(System.console().readLine());
            System.out.println("introduzca la altura del triangulo en cm: ");
            altura=Double.parseDouble(System.console().readLine());
            System.out.println("el area del rectangulo es " + (base * altura));
            break;

            case 3:
            System.out.println(" introduzca la base del triangulo en cm: ");
            base=Double.parseDouble(System.console().readLine());
            System.out.println("introduzca la altura del triangulo en cm: ");
            altura=Double.parseDouble(System.console().readLine());
            System.out.println("el area del triangulo es " + base *altura / 2);
            break;

            case 4:
            System.out.println(" introduzca la base del rectangulo en cm:");
            base=Double.parseDouble(System.console().readLine());
            System.out.println("introduzaca la altura del rectangulo");
            altura=Double.parseDouble(System.console().readLine());
            System.out.println("en area del triangulo es: " + base * altura);
            break;
            
            default:
            System.out.println("\n lo siento, la opcion no es correcta en cm: ");
           
        }
    }
}
