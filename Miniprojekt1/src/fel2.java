import java.util.Scanner;

public class fel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int probalkozasok=0;

        while (probalkozasok<3){
            System.out.print("Kérem, adja meg a jelszót: ");
            String jelszo=scanner.nextLine();

            if (jelszoEllenorzes(jelszo)) {
                System.out.println("Sikeres belépés");
                break;
            } else {
                probalkozasok++;
                if (probalkozasok<3){
                    System.out.println("Helytelen jelszo. Meg maradt " + (3-probalkozasok) + " lehetoseg");
                } else {
                    System.out.println("Haromszor helytelen jelszot adtal meg es a program leall");
                }
            }
        }
    }

    public static boolean jelszoEllenorzes(String jelszo) {
        String helyes_jelszo="jelszo123";
        return jelszo.equals(helyes_jelszo);
    }
}
