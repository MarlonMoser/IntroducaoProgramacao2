import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entradas

        System.out.print("Digite o dia =");
        int dia = teclado.nextInt();

        System.out.print("Digite o mês =");
        int mes = teclado.nextInt();

        System.out.print("Digite o ano =");
        int ano = teclado.nextInt();

        // Processos

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0)
            ;
        else {
            System.out.println("Não Valida");
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println(" valida");
        } else {
            if (mes != 2 && dia < 31) {
                System.out.println("Valida");
            } else {
                if (mes == 2 && dia < 29) {
                    System.out.println("Valida");
                }
                if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0))
                    ;
                {
                    System.out.println("valida");
                }

            }
        }
        teclado.close();
    }

}
