
class InvertirNumero {
 
   public static void main( String[] args ) {
      int numero, invertido = 0, resto;
 
      Scanner s = new Scanner( System.in );
      System.out.println( "Ejemplo para la inversión de un número" );
      System.out.println( "Introduce un número: " );
 
      numero = s.nextInt();
 
      while( numero > 0 ) {
         resto = numero % 10;
         invertido = invertido * 10 + resto;
         numero /= 10;
      }
 
      System.out.println( "Número invertido: " + invertido );
   }
 
}