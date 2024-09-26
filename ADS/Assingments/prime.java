
import java.util.Scanner;

 class Prime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // It is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test case 1
        System.out.print("Input: ");
        int input1 = scanner.nextInt();
        System.out.println("Output: " + isPrime(input1));

        // Test case 2
        System.out.print("Input: ");
        int input2 = scanner.nextInt();
        System.out.println("Output: " + isPrime(input2));
        
        scanner.close();
    }
}
