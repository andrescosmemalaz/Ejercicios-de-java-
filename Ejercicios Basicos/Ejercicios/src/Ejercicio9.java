// import java.util.Scanner;

public class DescuentoDel15EnUnaTienda {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double costo_del_articulo_1, costo_del_articulo_2, costo_del_articulo_3, descuento, pago_final;
        double total_de_la_compra;
        System.out.print("Ingresa el valor de costo del articulo 1: ");
        costo_del_articulo_1 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de costo del articulo 2: ");
        costo_del_articulo_2 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de costo del articulo 3: ");
        costo_del_articulo_3 = in.nextDouble();
        in.nextLine();
        total_de_la_compra=costo_del_articulo_1+costo_del_articulo_2+costo_del_articulo_3;
        if(total_de_la_compra>1000)
            descuento=total_de_la_compra*0.15;
        else
            descuento=0;
        pago_final=total_de_la_compra-descuento;
        System.out.println("Valor de descuento: " + descuento);
        System.out.println("Valor de pago final: " + pago_final);
        System.out.println("Valor de total de la compra: " + total_de_la_compra);
    }

}