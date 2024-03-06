public class fel5 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        if (array.length >= 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            System.out.println("Array: ");
            for (int element : array) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("The array is empty :(");
        }
    }
}
