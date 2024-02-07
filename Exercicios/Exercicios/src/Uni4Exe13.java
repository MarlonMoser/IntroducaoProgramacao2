import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entradas

        System.out.print("informe a Carta 1 : ");
        int carta1 = teclado.nextInt();

        System.out.print("informe a Carta 2 : ");
        int carta2 = teclado.nextInt();

        System.out.print("informe a Carta 3 : ");
        int carta3 = teclado.nextInt();

        int boas = 0;

        // Processos e saida
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            boas += 1;
        } else {
        }

        if (carta2 == 1 || carta3 == 2 || carta2 == 3) {
            boas = boas + 1;
        } else {

        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            boas++;
        } else {

        }
        if (boas == 1) {
            System.out.println("TRUCO");
        } else {
            if (boas == 2) {
                System.out.println("SEIS");
            } else {
                if (boas == 3) {
                    System.out.println("NOVE");
                }

            }
        }

        teclado.close();
    }

}
