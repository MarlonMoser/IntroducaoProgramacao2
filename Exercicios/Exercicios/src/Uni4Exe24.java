import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor 1:");
        int valor1 = teclado.nextInt();
        System.out.print("Digite o valor 2:");
        int valor2 = teclado.nextInt();
        System.out.print("Digite o valor 3:");
        int valor3 = teclado.nextInt();
        int ma = 0;
        int me = 0;
        int meio = 0;
        if (valor1 > valor2 && valor1 > valor3) {
            ma = valor1;
        } else {
            if (valor2 > valor1 && valor2 > valor3) {
                ma = valor2;
            } else {
                if (valor3 > valor1 && valor3 > valor2) {
                    ma = valor3;

                }

                if (valor1 != me && valor1 != me) {
                    meio = valor1;
                } else {
                    if (valor1 != me && valor2 != me) {
                        meio = valor2;
                    } else {
                        if (valor1 != ma && valor2 != me) {
                            meio = valor3;

                            if (valor1 < valor2 && valor1 < valor3) {
                                me = valor1;
                            } else {
                                if (valor2 < valor1 && valor2 < valor3) {
                                    me = valor2;
                                } else if (valor3 < valor1 && valor3 < valor2) {
                                    me = valor3;
                                }
                                System.out.println("Escolha uma das opções:");
                                System.out.println("se opção=1,  escreva os 3 valores em  ordem crescente");
                                System.out.println("se opção=2,  escreva os 3 valores em  ordem decrescente");
                                System.out.println(
                                        "se opção=3,  escreva os 3 valores de forma  qque o maior fique nomeio");
                                int opcao = teclado.nextInt();
                                switch (opcao) {
                                    case 1:
                                        System.out.println(me + " " + meio + " " + ma);
                                        break;
                                    case 2:
                                        System.out.println(ma + " " + meio + " " + me);
                                        break;
                                    case 3:
                                        System.out.println(me + " " + ma + " " + meio);
                                }
                                teclado.close();
                            }
                        }
                    }
                }
            }
        }
    }
}
