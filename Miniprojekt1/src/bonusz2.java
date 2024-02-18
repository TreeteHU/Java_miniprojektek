import java.util.Random;
import java.util.Scanner;

public class bonusz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int gondoltSzam = random.nextInt(100) + 1;
        int tippeltSzam;
        int lepesSzam = 0;

        System.out.println("Gondoltam egy számra 1 és 100 között. Tippelj!");

        do {
            System.out.print("Tipp: ");
            tippeltSzam = scanner.nextInt();
            lepesSzam++;

            if (tippeltSzam < gondoltSzam) {
                System.out.println("Sok! A szám nagyobb.");
            } else if (tippeltSzam > gondoltSzam) {
                System.out.println("Kevés! A szám kisebb.");
            } else {
                System.out.println("Eltaláltad " + lepesSzam + " lépés után!");
            }
        } while (tippeltSzam != gondoltSzam);

        scanner.close();
    }
}
