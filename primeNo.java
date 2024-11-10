import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[10];

        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

       
        System.out.println("Prime numbers:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

   
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

