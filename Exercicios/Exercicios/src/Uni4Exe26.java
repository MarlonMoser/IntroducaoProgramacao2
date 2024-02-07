import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double base, altura, area, lado, raio;

        System.out.println("T:calcular a área de um triângulo de base b e altura h");
        System.out.println("Q:calcular a área de um quadrado de lado l");
        System.out.println("R:calcular a área de um retângulo de base b e altura h");
        System.out.println("C:calcular a área de um círculo de raio r");
        System.out.print("Qual  opção voce  escolhe: ");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "T":
                System.out.println("Digite a base do triângulo ");
                base = teclado.nextDouble();
                System.out.println("Digite a altura triângulo ");
                altura = teclado.nextDouble();
                area = base * (altura / 2);
                System.out.println("Área do triângulo = " + area);
                break;
            case "Q":
                System.out.println("Digite o lado");
                lado = teclado.nextDouble();
                area = +lado * lado;
                System.out.println("Área do quadrado = " + area);
                break;
            case "R":
                System.out.println("Digite a base do retângulo ");
                base = teclado.nextDouble();
                System.out.println("Digite a altura do retângulo ");
                altura = teclado.nextDouble();
                area = base * altura;
                System.out.println("Área do retângulo = " + area);
                break;
            case "C":
                System.out.println("Digite o raio");
                raio = teclado.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do circulo = " + area);
        }

        teclado.close();
    }
}
