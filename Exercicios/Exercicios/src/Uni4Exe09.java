import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número : ");
        int b = teclado.nextInt();

        if (b > a) {
            System.out.println("O segundo número não pode ser maior que o primeiro!");
        } else if (a % b == 0) {
            System.out.printf(" é múltiplo ");
        } else {
            System.out.printf("%não é múltiplo ");
        }
        teclado.close();
    }
}
