public class Ejercicio01Saluda {
    public static void main(String[] args) {
      String nombre;
      System.out.print("Dime tu nombre: ");
      nombre = System.console().readLine();
      System.out.println("Hola " + nombre);
    }
  }