import java.util.Scanner;

public class pattern1 {

    // Pyramid of Numbers
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.println("Pyramid of Numbers:");
        numberPyramid(n);

    }
}