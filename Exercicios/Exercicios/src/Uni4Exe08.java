import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] Args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("coloque alguma letra:");
        String letra = teclado.next();

        letra = letra.toUpperCase();

        if (letra.equals("a") || letra.equals("e")
                || letra.equals("i") || letra.equals("o")
                || letra.equals("u")) {
            System.out.println("é vogal.");
        } else {
            System.out.println("Não é vogal");
        }

        teclado.close();
    }

}
