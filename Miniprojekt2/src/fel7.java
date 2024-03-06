public class fel7 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 3, 6, 7, 8, 7, 2, 9, 3 };

        System.out.println("Multiple times occurring elements:");
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = -1;
                    }
                }
                if (count > 1) {
                    System.out.println("\"" + array[i] + "\"" + " - " + count + " times occured");
                }
            }
        }
    }
}
