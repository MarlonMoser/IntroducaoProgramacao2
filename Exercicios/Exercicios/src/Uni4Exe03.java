import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] Args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" X: ");
        int x = teclado.nextInt();
        System.out.println("  Y: ");
        int y = teclado.nextInt();

        if (x > y) {
            System.out.println(x + " É maior que " + y);
        }
        if (y > x) {
            System.out.println(y + " É maior que " + x);
        }
        if (x == y) {
            System.out.println("são iguais.");
        }
        teclado.close();
    }

}
