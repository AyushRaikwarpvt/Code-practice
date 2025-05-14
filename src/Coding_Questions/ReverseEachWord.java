package Coding_Questions;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "hello java world";

        // Split the string by spaces to get words
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word using StringBuilder
            String reversed = new StringBuilder(word).reverse().toString();
            result.append(reversed).append(" ");
        }

        // Trim the last extra space and print result
        System.out.println("Output: " + result.toString().trim());
    }
}
