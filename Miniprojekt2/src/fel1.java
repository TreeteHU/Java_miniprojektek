import java.util.Scanner;

public class fel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Addj meg egy szot: ");
        String szo = scanner.nextLine();

        if (szo.length() > 0) {
            char elsoKarakter = szo.charAt(0);
            char utolsoKarakter = szo.charAt(szo.length() - 1);

            System.out.println("Az elso karakter: " + elsoKarakter);
            System.out.println("Az utolso karakter: " + utolsoKarakter);
        } else {
            System.out.println("Nem adtal meg egy szot se.");
        }

        scanner.close();
    }
}
