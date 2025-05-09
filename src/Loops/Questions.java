package Loops;

public class Questions {

    // Print numbers from 1 to End using a for loop.
    public void printNumbers(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }

    // Print even numbers up to End using a while loop.
    public void printEvenWhile(int end) {
        int i = 2;
        while (i <= end) {
            System.out.println(i);
            i += 2;
        }
    }

    // Print the first N natural numbers using a do-while loop.
    public void printNaturalDoWhile(int end) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= end);
    }

    // Calculate the sum from Start to End.
    public void sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    // Print multiplication table of a number.
    public void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // Print numbers in reverse from End to 1.
    public void printReverse(int end) {
        for (int i = end; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Print only odd numbers up to Range.
    public void printOdds(int range) {
        for (int i = 1; i <= range; i += 2) {
            System.out.println(i);
        }
    }

    // Find factorial of a number.
    public void factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }

    // Count number of digits in a number.
    public void countDigits(int number) {
        int count = 0;
        int copy = number;
        while (copy != 0) {
            copy /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    // Print square of numbers in a range.
    public void printSquares(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }

    // Print a square pattern of *.
    public void printSquarePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print a right-angled triangle pattern.
    public void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j >= rows - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Sum of even numbers in a given range.
    public void sumEvenNumbers(int range) {
        int sum = 0;
        for (int i = 2; i <= range; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    // Find the largest number in an array.
    public void findLargest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest number: " + largest);
    }

    // Print Fibonacci series up to N terms.
    public void fibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);
        for (int i = 3; i <= terms; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Reverse a given number.
    public void reverseNumber(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Print a pyramid pattern of *.
    public void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * rows - 1; j++) {
                if (j >= rows - (i - 1) && j <= rows + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Print full multiplication table from 1 to 10.
    public void fullMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("----------");
        }
    }

    // Check whether a number is palindrome.
    public void checkPalindrome(int number) {
        int original = number, reversed = 0;
        while (number != 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    // Count occurrences of a digit in a number.
    public void countDigitOccurrences(int number, int digitToCount) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == digitToCount) {
                count++;
            }
            number /= 10;
        }
        System.out.println("Digit " + digitToCount + " occurs " + count + " times.");
    }

    // Main method to run all functions
    public static void main(String[] args) {
        Questions q = new Questions();

        q.printEvenWhile(30);
        System.out.println("--------------");

        q.printNumbers(20);
        System.out.println("--------------");

        q.printNaturalDoWhile(10);
        System.out.println("--------------");

        q.sumRange(1, 10);
        System.out.println("--------------");

        q.printTable(10);
        System.out.println("--------------");

        q.printReverse(10);
        System.out.println("--------------");

        q.printOdds(20);
        System.out.println("--------------");

        q.factorial(5);
        System.out.println("--------------");

        q.countDigits(12345);
        System.out.println("--------------");

        q.printSquares(1, 10);
        System.out.println("--------------");

        q.printSquarePattern(5);
        System.out.println("--------------");

        q.printRightTriangle(5);
        System.out.println("--------------");

        q.sumEvenNumbers(20);
        System.out.println("--------------");

        int[] arr = {3, 8, 1, 9, 4};
        q.findLargest(arr);
        System.out.println("--------------");

        q.fibonacci(10);
        System.out.println("--------------");

        q.reverseNumber(12345);
        System.out.println("--------------");

        q.printPyramid(5);
        System.out.println("--------------");

        q.fullMultiplicationTable();
        System.out.println("--------------");

        q.checkPalindrome(121);
        System.out.println("--------------");

        q.countDigitOccurrences(12333345, 3);
    }
}
