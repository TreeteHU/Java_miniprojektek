public class fel5 {
    public static Boolean csakAlfanumerikus(String string_tesztelni) {
        for (int i = 0; i < string_tesztelni.length(); i++) {
            char karakter = string_tesztelni.charAt(i);
            if (!(karakter >= 'a' && karakter <= 'z') && !(karakter >= 'A' && karakter <= 'Z')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String tesztString1 = "Helloezegyteszt";
        String tesztString2 = "Hello ez egy teszt 123";

        System.out.println("Test1: " + csakAlfanumerikus(tesztString1));
        System.out.println("Test2: " + csakAlfanumerikus(tesztString2));
    }
}
