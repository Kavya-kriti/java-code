import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                continueCalculating = false;
            } else {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                if (choice == 1) {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (choice == 4) {
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                } else {
                    System.out.println("Invalid choice. Please try again.");
                   
                }
            }
        }
        scanner.close();
    }
}


