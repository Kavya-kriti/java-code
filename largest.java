import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of integers
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Create an array to store the integers
        int[] numbers = new int[n];

        // Get the integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Find and display the second largest number
        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("No second largest number found.");
        }
    }

    // Method to find the second largest number
    public static int findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            return Integer.MIN_VALUE; // No second largest number
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }

        return secondMax;
    }
}

