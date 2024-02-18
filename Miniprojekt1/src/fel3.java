import java.util.Scanner;

public class fel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        while (true) {


            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");

            int valasztas = scanner.nextInt();

            double eredmeny = 0;

            switch (valasztas) {
                case 1:
                    eredmeny = num1 + num2;
                    break;
                case 2:
                    eredmeny = num1 - num2;
                    break;
                case 3:
                    eredmeny = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        eredmeny = num1 / num2;
                    } else {
                        System.out.println("Error: division by zero!");
                        continue;
                    }
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            System.out.println("Result:" + eredmeny);
        }
    }
}
