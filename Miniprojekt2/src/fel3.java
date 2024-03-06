public class fel3 {
    public static void main(String[] args) {
        String input = "sssjkllllopww223";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Reoved duplicates string: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean alreadyExists = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == currentChar) {
                    alreadyExists = true;
                    break;
                }
            }


            if (!alreadyExists) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
