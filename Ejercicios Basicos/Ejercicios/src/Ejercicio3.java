// import java.util.Scanner;
 
public class CalculoHipotenusa {
     
    private static Scanner sc;
 
    public static void main(String[] args) {
          
        double cateto1, cateto2, hipotenusa;
        cateto1 = leerNumeroReal("Introduce el primer cateto: ");
        cateto2 = leerNumeroReal("Introduce el segundo cateto: ");
  
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("%nLa hipotenusa es %.2f.", hipotenusa);
  
        hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.printf("%nLa hipotenusa es %.2f.", hipotenusa);
    }
  
    private static double leerNumeroReal(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}