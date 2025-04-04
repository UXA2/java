
public class DimeNombre {
    public static void main(String[] args) {
       String nombre; 
       String apellido;
       String domicilio;
       String lugarDeNaciento;
      

       System.out.println("por favor dime como te llamas ");
        nombre = System.console().readLine();
        System.out.println("hola " + nombre + ", encantado de conocerte");

        System.out.println("cuales son tus apellidos paterno y materno");
        apellido = System.console().readLine();
        System.out.println("tus apellidos son " + apellido);

        System.out.println("cual es tu domicilio actual");
        domicilio = System.console().readLine();
        System.out.println("tu domicilio actual es " + domicilio);

        System.out.println("lugar de nacimiento");
        lugarDeNaciento = System.console().readLine();
        System.out.println("lugar de nacimiento es " + lugarDeNaciento);

        
       

    }
    
}
