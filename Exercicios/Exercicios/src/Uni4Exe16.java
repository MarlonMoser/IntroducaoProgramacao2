import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int homemvelho, mulhernova, mulhervelha, homemnovo;

        System.out.print(" Qual a idade do Homem 1:");
        int h1 = teclado.nextInt();

        System.out.print(" Qual a idade do Homem 2:");
        int h2 = teclado.nextInt();

        System.out.print(" Qual a idade da Mulher 1:");
        int m1 = teclado.nextInt();

        System.out.print(" Qual a idade da Mulher 2:");
        int m2 = teclado.nextInt();

        // Processos

        if (h1 > h2 && m1 < m2) {
            homemvelho = h1;
            mulhernova = m1;
            mulhervelha = m2;
            homemnovo = h2;

            int soma = homemvelho + mulhernova;
            int produto = homemnovo * mulhervelha;

            System.out.println("soma das idades do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("o produto das idades do homem mais novo com a mulher mais velha é: " + produto);

        } else {
            if (h1 > h2 && m1 > m2) {
                homemvelho = h1;
                mulhernova = m2;
                mulhervelha = m1;
                homemnovo = h2;

                int soma = homemvelho + mulhernova;
                int produto = homemnovo * mulhervelha;
                System.out.println("soma das idades do homem mais velho com a mulher mais nova é: " + soma);
                System.out.println("o produto das idades do homem mais novo com a mulher mais velha é: " + produto);
            } else {
                if (h1 < h2 && m1 < m2) {
                    homemvelho = h2;
                    mulhernova = m1;
                    mulhervelha = m2;
                    homemnovo = h1;

                    int soma = homemvelho + mulhernova;
                    int produto = homemnovo * mulhervelha;

                    System.out.println("soma das idades do homem mais velho com a mulher mais nova é: " + soma);
                    System.out.println("o produto das idades do homem mais novo com a mulher mais velha é: " + produto);
                }
            }

            teclado.close();

        }
    }
}
