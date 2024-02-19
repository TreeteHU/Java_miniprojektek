public class fel6 {

    public static Boolean tombEgyenloseg(int[] tomb1, int[] tomb2) {
        if (tomb1.length != tomb2.length) {
            return false;
        }

        for (int i = 0; i < tomb1.length; i++) {
            if (tomb1[i] != tomb2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tomb1 = {1, 2, 3, 4, 5};
        int[] tomb2 = {1, 2, 3, 4, 5};
        int[] tomb3 = {1, 2, 3, 4, 6};
        System.out.println("tomb1 es tomb2 egyenlo? " + tombEgyenloseg(tomb1, tomb2));
        System.out.println("tomb1 es tomb3 egyenlo? " + tombEgyenloseg(tomb1, tomb3));
    }
}
