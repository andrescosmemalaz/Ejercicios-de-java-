
public class Ejercicio18MuestraIniciales {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      String nombre;
      String apellido1;
      String apellido2;
      String iniciales;
  
  // Solicitud de datos al usuario
      System.out.println("Este programa pide nombre y apellidos y después devuelve las iniciales.");
      System.out.print("Nombre: ");
      nombre = scanner.nextLine();
      System.out.print("Primer apellido: ");
      apellido1 = scanner.nextLine();
      System.out.print("Segundo apellido: ");
      apellido2 = scanner.nextLine();
  
  // Realizamos operaciones 
      iniciales = nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1);
  
  // Mostramos en pantalla
      System.out.println("Las iniciales son: " +iniciales);    
    }
  }