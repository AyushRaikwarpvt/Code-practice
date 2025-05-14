package Coding_Questions;

import java.util.Arrays;

public class LeftRotateArray {
    // Function to rotate array to the left by k positions
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle if k > n

        // Step 1: Copy rotated array
        int[] result = new int[n];

        // Copy from k to end
        for (int i = 0; i < n - k; i++) {
            result[i] = arr[i + k];
        }

        // Copy first k elements to end
        for (int i = n - k, j = 0; i < n; i++, j++) {
            result[i] = arr[j];
        }

        // Print rotated array
        System.out.println("Rotated Array: " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        rotateLeft(arr, k);
    }
}
