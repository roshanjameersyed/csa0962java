public class ReverseWord {
    public static void main(String[] args) {
        String original = "TEMPLE";
        StringBuilder reversed = new StringBuilder();

        // Loop through the original string from the end to the beginning
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed.toString());
    }
}