import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entradas

        System.out.print("Entre com o comprimento 1: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Entre com o comprimento 2: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Entre com o comprimento 3: ");
        double lado3 = teclado.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        teclado.close();
    }
}
