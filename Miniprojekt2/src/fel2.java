import java.util.Scanner;

public class fel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String input = scanner.nextLine();

        String replacedString = input.replace('a', '*');

        System.out.println("The replaced word: " + replacedString);

        scanner.close();
    }
}
