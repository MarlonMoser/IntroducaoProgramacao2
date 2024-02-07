import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Qual sua altura: ");
        double al = teclado.nextDouble();
        double imc = peso / Math.pow(al, 2);

        if (imc < 18.5) {
            System.out.print("  Magreza");
        } else {
            if (imc >= 18.5 && imc < 25) {
                System.out.print("  saudável");
            } else {
                if (imc >= 25 && imc < 30) {
                    System.out.print("  Sobrepeso");
                } else {
                    if (imc >= 30 && imc < 35) {
                        System.out.print("  Obesidade Grau I");
                    } else {
                        if (imc >= 35 && imc < 40) {
                            System.out.print("  Obesidade Grau II(severa)");
                        } else {
                            if (imc >= 40) {
                                System.out.print("  Obesidade Grau III(mórbida)");
                            }

                            teclado.close();

                        }

                    }
                }
            }
        }
    }
}
