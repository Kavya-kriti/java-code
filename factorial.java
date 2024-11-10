import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Calculate sum of digits
        int digitSum = calculateDigitSum(factorial);

        // Print results
        System.out.println(number + "! = " + factorial);
        System.out.println("Sum of digits: " + digitSum);
    }

    // Method to calculate factorial
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
    public static int calculateDigitSum(long number) {
        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
          
                }
                return digitSum;
            }
        }
        