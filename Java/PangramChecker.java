public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input to lowercase
        input = input.toLowerCase();
        
        // Create a boolean array to track the presence of each letter
        boolean[] alphabet = new boolean[26];
        
        // Iterate through the input string and mark the corresponding letter as present
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        
        // Check if all letters (a to z) are marked as present
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
