// import java.util.Scanner;
/**
*/
// Inicio del programa y declaración de variables:
public class Ejercicio15IntercambioDosValores {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int valorA;
    int valorB;
    int valorC;
    System.out.println("Este programa pide dos valores e intercambia el valor entre ambas variables.");
    System.out.print("Introduce el valor A: ");
    valorA = scanner.nextInt();
    System.out.print("Introduce el valor B: ");
    valorB = scanner.nextInt();
    
    valorC = valorA;
    valorA = valorB;
    valorB = valorC;
    System.out.println("Tras el cambio, valor A= "+valorA + " y valor B = "+valorB);
    
  }
}