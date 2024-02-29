import java.util.Scanner;

public class fel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adj meg egy szot: ");
        String input = scanner.nextLine();

        String kicsereltString = input.replace('a', '*');

        System.out.println("A kicserelt szo: " + kicsereltString);

        scanner.close();
    }
}
