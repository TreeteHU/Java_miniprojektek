import java.util.Scanner;

public class fel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = scanner.nextLine();

        if (word.length() > 0) {
            char firstCharacter = word.charAt(0);
            char lastCharacter = word.charAt(word.length() - 1);

            System.out.println("The first character: " + firstCharacter);
            System.out.println("The last character: " + lastCharacter);
        } else {
            System.out.println("You didn't give anything.");
        }

        scanner.close();
    }
}
