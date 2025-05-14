package Coding_Questions;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Ayush Raikwar";  // Example input string
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String input) {
        // Iterate over the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            // Check if the character is already counted
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j) && input.charAt(j) != '0') {
                    count++;
                    input = input.substring(0, j) + '0' + input.substring(j + 1);
                }
            }

            // Print the character and its count if it is not '0'
            if (currentChar != '0') {
                System.out.println(currentChar + "=" + count);
            }
        }
    }
}

