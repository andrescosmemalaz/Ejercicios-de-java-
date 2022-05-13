public class RaizCuadradaCubica {
    public static void main(String[] args) {
        double numero = 25;
        double raizCuadrada = Math.sqrt(numero);
        System.out.printf("Raíz cuadrada de %.2f es %.2f\n", numero, raizCuadrada);
        double otroNumero = 125;
        double raizCubica = Math.cbrt(otroNumero);
        System.out.printf("Raíz cúbica de %.2f es %.2f\n", otroNumero, raizCubica);
        double miNumero = 125;
        double raizCubicaConCbr = Math.pow(miNumero, (double) 1 / 3);
        System.out.printf("Raíz cúbica de %.2f es %.2f\n", miNumero, raizCubicaConCbr);
    }
}