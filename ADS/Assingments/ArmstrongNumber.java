
    import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test case 1
        System.out.print("Input: ");
        int input1 = scanner.nextInt();
        System.out.println("Output: " + isArmstrong(input1));

        // Test case 2
        System.out.print("Input: ");
        int input2 = scanner.nextInt();
        System.out.println("Output: " + isArmstrong(input2));
        
        scanner.close();
    }
}


