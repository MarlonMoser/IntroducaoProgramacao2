import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = teclado.nextInt();

        System.out.print("Digite a média dos exercícios: ");
        double Exe = teclado.nextDouble();
        double media = (nota1 + nota2 * 2 + nota3 * 3 + Exe) / 7;
        String Nota = "a";

        if (media < 4) {
            Nota = "E";
            System.out.println("A média é de " + df_2.format(media) + " conceito: " + Nota + " reprovado");
        } else {
            if (media >= 4 && media < 6) {
                Nota = "D";
                System.out.println("A média é de " + df_2.format(media) + "conceito: " + Nota + " reprovado");
            } else {
                if (media >= 6 && media < 7.5) {
                    Nota = "C";
                    System.out.println("A média é de " + df_2.format(media) + " conceito: " + Nota + " aprovado");
                } else {
                    if (media >= 7.5 && media < 9) {
                        Nota = "B";
                        System.out
                                .println("A média é de " + df_2.format(media) + "conceito: " + Nota + " aprovado");
                    } else {
                        if (media >= 9) {
                            Nota = "A";
                            System.out.println(
                                    "A média é de " + df_2.format(media) + "conceito: " + Nota + " aprovado");
                        }

                        teclado.close();

                    }
                }
            }
        }
    }
}
