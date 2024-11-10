import java.util.Scanner;

public class pattern2 {

    // Inverted Triangle of Numbers
    public static void invertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.println("Inverted Triangle of Numbers:");
        invertedTriangle(n);
 }
}