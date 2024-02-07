import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double impos, liqui, descontodepen;
        double fim;

        System.out.print(" Quantidade de depndentes =");
        double depen = teclado.nextDouble();

        System.out.print(" Renda Anual =");
        double rendanual = teclado.nextDouble();

        if (rendanual <= 2000) {
            System.out.println("Não paga imposto");
        } else {
            if (rendanual > 2000 && rendanual <= 5000) {
                descontodepen = ((depen + 2) / 100) * rendanual;
                liqui = rendanual - descontodepen;
                impos = 0.05 * liqui;
                fim = liqui - impos;

                System.out.print("Valor liquido e de  = " + df_2.format(fim));
            }

            if (rendanual > 5000 && rendanual <= 10000) {
                descontodepen = ((depen + 2) / 100) * rendanual;
                liqui = rendanual - descontodepen;
                impos = 0.10 * liqui;
                fim = liqui - impos;

                System.out.print("Valor liquido e de = " + df_2.format(fim));
            }
            if (rendanual > 10000) {
                descontodepen = ((depen + 2) / 100) * rendanual;
                liqui = rendanual - descontodepen;
                impos = 0.15 * liqui;
                fim = liqui - impos;

                System.out.print("Valor liquido e de = " + df_2.format(fim));
            }
        }
        teclado.close();
    }

}
