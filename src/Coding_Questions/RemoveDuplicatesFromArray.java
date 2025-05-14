package Coding_Questions;

public class RemoveDuplicatesFromArray {

    // 👇 Function to remove duplicates
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];  // Store unique elements
        int newIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already exists in temp array
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[newIndex++] = arr[i];
            }
        }

        // Create final result array with actual unique size
        int[] result = new int[newIndex];
        for (int i = 0; i < newIndex; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {4, 5, 2, 4, 2, 3, 1, 5, 3, 9};

        int[] unique = removeDuplicates(input);

        System.out.print("Array after removing duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}

