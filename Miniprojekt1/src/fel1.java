import java.util.Scanner;

public class fel1 {

    public static void main(String[] args) {
        System.out.print("Adj meg egy szamot: ");
        Scanner scanner = new Scanner(System.in);
        int szorzando_szam = scanner.nextInt();
        if (szorzando_szam >= 1 && szorzando_szam <= 10) {
            for (int i = 1; i < 11; i++) {
                System.out.println(szorzando_szam + " x " + i + " = " + szorzando_szam * i);
            }
        } else {
            System.out.println("Csak 1 es 10 kozott lehet a szam");
        }
        scanner.close();
    }

}