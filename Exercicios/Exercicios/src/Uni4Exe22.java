import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1 Ciência da computação");
        System.out.println("2 Licenciatura da computação");
        System.out.println("3 Sistemas da informação");
        System.out.print("Quais desses cursos estas a cursar: ");
        int curso = teclado.nextInt();

        switch (curso) {
            case 1:
                System.out.println("Bacharel em Ciência da computação");
                break;
            case 2:
                System.out.println("Licenciado em computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }
        teclado.close();
    }
}