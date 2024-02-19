import java.util.Scanner;

public class bonusz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alapárhoz képesti változók
        int alapAr = 100;
        int duplaCukorPlusz = 20;
        int habosPlusz = 50;
        int poharNelkuliKedvezmeny = 10;

        // Felhasznói választás
        System.out.println("Válasszon kávét (alapar:100):");
        System.out.println("1. Pohár nélkül (-10)");
        System.out.println("2. Dupla cukorral (+20)");
        System.out.println("3. Habos kávé (+50)");
        int valasztas = scanner.nextInt();

        // Számítás az ár alapján
        int ar;
        switch (valasztas) {
            case 1:
                ar = alapAr - poharNelkuliKedvezmeny;
                break;
            case 2:
                ar = alapAr + duplaCukorPlusz;
                break;
            case 3:
                ar = alapAr + habosPlusz;
                break;
            default:
                System.out.println("Érvénytelen választás!");
                return;
        }

        // Összeg bekérése
        System.out.println("Kérjük, adja meg a megfelelő összeget:");
        int befizetettOsszeg = scanner.nextInt();

        // Ellenőrzés és visszajelzés
        if (befizetettOsszeg >= ar) {
            int visszajaro = befizetettOsszeg - ar;
            System.out.println("Kávé elkészült! Visszajáró: " + visszajaro + " Ft");
        } else {
            System.out.println("Nem elegendő összeg! Hiányzó összeg: " + (ar - befizetettOsszeg) + " Ft");
        }
    }
}
