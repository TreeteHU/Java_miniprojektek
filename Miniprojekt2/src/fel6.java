public class fel6 {
    public static void main(String[] args) {
        int[] array = {5, -5 ,3, 9, 2, 8, 1, 7};

        int smallestNumber = array[0];
        int biggestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Biggest number: " + biggestNumber);
    }
}
