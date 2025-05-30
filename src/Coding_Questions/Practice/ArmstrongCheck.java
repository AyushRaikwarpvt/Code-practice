package Coding_Questions.Practice;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;

        int digits = 0;
        int temp = number;

        // Step 1: Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = number;

        // Step 2: Calculate sum of digits raised to the power of 'digits'
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Step 3: Compare
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}

