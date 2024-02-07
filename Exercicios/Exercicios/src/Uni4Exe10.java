import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada

        System.out.print(" Qual e idade de Marquinhos: ");
        int Mar = teclado.nextInt();

        System.out.print(" Qual e idade de Zezinho: ");
        int Zez = teclado.nextInt();

        System.out.print(" Qual e idade de Luluzinha: ");
        int Lul = teclado.nextInt();

        // Processo e saida

        if (Mar < Zez && Mar < Lul) {
            System.out.println(" Marquinhos e o mais novo ");
        }

        else if (Zez < Mar && Zez < Lul) {
            System.out.println(" Zezinho e o mais novo");
        }

        else {
            System.out.println(" Luluzinha e a mais nova");
        }

        teclado.close();
    }

}