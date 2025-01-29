//Write a function that calculates the sum of digits entered by the user. (If they enter 123, 6 is printed.)
import java.util.Scanner;
public class CodeWarmup {
    public static void main(String[] args) {
        // Step 1: Read the number from the user
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Step 2: Calculate the sum of digits
            int sum = calculateSumOfDigits(number);

            // Step 3: Display the result
            System.out.println("The sum of the digits of " + number + " is " + sum);
        }
    }

    // Method to calculate the sum of digits of a number
    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            // Extract the last digit of the number
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }

        return sum;
    }
}
