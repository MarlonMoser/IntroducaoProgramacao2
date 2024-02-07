import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("quantidade de meses que o funcionario foi admitido: ");
        int meses = teclado.nextInt();

        if (meses == 0) {
            System.out.println("não trabalhou  na empresa");
        } else {

            if (meses <= 12) {
                System.out.println("ganhara 5% de reajuste");
            } else {
                if (13 >= meses || meses <= 48) {
                    System.out.println(" ganhara 7% de reajuste");
                } else {
                    if (meses > 48) {
                        System.out.println("não ganhara reajuste");
                    }

                }

                teclado.close();
            }

        }
    }
}
