import java.util.Scanner;

public class stringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char c = scanner.next().charAt(0);
        scanner.close();

        int count = countCharacters(str, c);

        System.out.println("The character '" + c + "' occurs " + count + " times.");
    }

    public static int countCharacters(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}