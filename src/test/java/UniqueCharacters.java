public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "programming";
        findUniqueCharacters(input);
    }

    public static void findUniqueCharacters(String str) {
        System.out.println("Unique characters in the string:");

        // Outer loop to select each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0; // Initialize count for current character

            // Inner loop to count occurrences of currentChar
            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }

            // If the count is exactly 1, it is a unique character
            if (count == 1) {
                System.out.println(currentChar);
            }
        }
    }
}
