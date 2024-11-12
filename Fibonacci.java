import java.util.Scanner;

public class Fibonacci  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of terms: ");
        int
        n = scanner.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("Fibonacci sequence: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
