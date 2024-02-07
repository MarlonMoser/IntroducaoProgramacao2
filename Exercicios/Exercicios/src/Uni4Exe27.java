import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double pagar;

        System.out.println("Que horas você chegou ");
        int horc = teclado.nextInt();
        System.out.println("Que  minutos ");
        int minc = teclado.nextInt();

        System.out.println("Que horas você saiu ");
        int hors = teclado.nextInt();
        System.out.println("Que minutos você saiu ");
        int mins = teclado.nextInt();
        horc = (minc + (horc * 60));
        mins = mins + (hors * 60);
        int total = mins - minc;
        int hora = total / 60;
        int min = total % 60;
        if (mins >= 30) {
            hora = hora + 1;
        }
        if (total <= 29) {
            hora = 0;
        }
        if (hora == 0) {
            pagar = 5.00;
        } else {
            if (hora <= 2.00) {
                pagar = hora * 5.00;
                System.out.println("Vai ter que pagar  R$" + pagar + "por ter:");
                System.out.println("Ficado:" + hora + "Estacionado");
                System.out.println("Ficado:" + min + "Estacionado");
            } else {
                if (hora >= 2.00 && hora <= 4) {
                    pagar = 10.00 + (hora - 2) * 7.50;
                    System.out.println("Vai ter que pagar  R$" + pagar + "por ter:");
                    System.out.println("Ficado:" + hora + "Estacionado");
                    System.out.println("Ficado:" + min + "Estacionado");
                } else {
                    if (hora >= 5.00) {
                        pagar = 25.00 + (hora - 4) * 10.00;
                    }
                    if (min > 29) {
                        hora = hora - 1;
                        pagar = 5 + hora;
                        System.out.println("Vai ter que pagar  R$" + pagar + "por ter:");
                        System.out.println("Ficado:" + hora + "Estacionado");
                        System.out.println("Ficado:" + min + "Estacionado");
                    }

                    teclado.close();
                }
            }
        }
    }
}