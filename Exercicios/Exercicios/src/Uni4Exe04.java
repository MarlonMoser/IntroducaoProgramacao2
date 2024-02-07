import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um valor qualquer: ");
        double valor = teclado.nextDouble();

        if (valor <= 9) {

            System.out.println("O número não possui casas decimais.");
        } else {

            System.out.println("O número possui casas decimais.");
        }

        teclado.close();

    }
}