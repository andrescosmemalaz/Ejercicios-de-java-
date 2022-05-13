// import java.util.Scanner;

public class Ejercicio6{

public static void main(String[] args) {
Scanner num = new Scanner (System.in);

System.out.print("programa que calcule el promedio de tres numeros\n \n");

System.out.print("ingrese el primer numero:");
int n1 = num.nextInt();

System.out.print("ingrese el segundo numero:");
int n2 = num.nextInt();

System.out.print("ingrese el tercer numero:");
int n3 = num.nextInt();

float Resultado = (float)(n1 + n2 + n3) / 3;
System.out.print("el resultado del promedio de tres numeros es:" + Resultado);



}