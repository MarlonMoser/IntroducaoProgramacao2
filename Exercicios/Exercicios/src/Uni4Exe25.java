import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um  numero: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite um numero: ");
        double n2 = teclado.nextDouble();
        System.out.println("1 Soma de dois números.");
        System.out.println("2 Diferença entre dois números.");
        System.out.println("3 Produto entre dois números.");
        System.out.println("4 Divisão entre dois números.");
        System.out.print("Qual opção você escolhe:");
        int algum = teclado.nextInt();

        double resu = 0;

        switch (algum) {
            case 1:
                resu = n1 + n2;
                System.out.println(df_2.format(resu));
                break;
            case 2:
                resu = n1 - n2;
                System.out.println(df_2.format(resu));
                break;
            case 3:
                resu = n1 * n2;
                System.out.println(df_2.format(resu));
                break;
            case 4:
                resu = n1 / n2;
                if (n2 == 0) {
                    System.out.println("Erro");
                } else {
                    System.out.println(df_2.format(resu));
                }

                teclado.close();

        }
    }
}