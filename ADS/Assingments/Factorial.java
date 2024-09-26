
    import java.util.Scanner;

public class Factorial{

    public static long factorial(int number) {
        if (number == 0) {
            return 1; // Base case: 0! = 1
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test case 1
        System.out.print("Input: ");
        int input1 = scanner.nextInt();
        System.out.println("Output: " + factorial(input1));

        // Test case 2
        System.out.print("Input: ");
        int input2 = scanner.nextInt();
        System.out.println("Output: " + factorial(input2));
        
        scanner.close();
    }
}


