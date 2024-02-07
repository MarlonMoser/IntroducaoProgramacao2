import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entradas

        System.out.print("Ano de nascimento de Dudu :");
        int irm1 = teclado.nextInt();

        System.out.print("Ano de nascimento de Bianca :");
        int irm2 = teclado.nextInt();

        System.out.print("Ano de nascimento de Pedro :");
        int irm3 = teclado.nextInt();

        if (irm1 == irm2 && irm1 == irm3) {
            System.out.println(" Os irmãos são trigemios");
        }

        else if ((irm1 == irm2 && irm1 != irm3) ||
                (irm1 == irm3 && irm1 != irm2) || (irm2 == irm3 && irm2 != irm1)) {
            System.out.println("Os irmãos são Gêmeos");
        } else {
            System.out.println("Os irmãos possuem idades diferentes");
        }

        teclado.close();

    }

}