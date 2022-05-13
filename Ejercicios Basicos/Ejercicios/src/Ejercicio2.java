// import java.util.Scanner;
 
public class AreaPerimetroRectangulo {
     
    private static Scanner sc;
 
    public static void main(String[] args){
          
        double perimetro, area;
        double base = leerNumeroReal("Introduce la base del rectangulo: ");
        double altura = leerNumeroReal("Introduce la altura del ractangulo: ");
        perimetro = 2 * (base+altura);
        area = base * altura;
  
        System.out.printf("%nEl perímetro del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
        System.out.printf("%nEl área del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, area);
    }
  
    private static double leerNumeroReal(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}