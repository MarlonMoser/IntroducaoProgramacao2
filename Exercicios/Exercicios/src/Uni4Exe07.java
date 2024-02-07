import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pesoex, qtAdc;

        System.out.println("Entre com o peso da carta :");
        double peso = teclado.nextDouble();
        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
            System.out.println("Custo do selo: " + valorPagar);
        } else {
            pesoex = peso - 50;
            qtAdc = (pesoex / 20) + 1;
            valorPagar = 0.45 + 0.45 * qtAdc;
            System.out.println("Custo do selo: " + valorPagar);
        }
        teclado.close();

    }

}
