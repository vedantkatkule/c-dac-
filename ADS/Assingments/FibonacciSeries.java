import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        
        int[] fibonacciSeries = generateFibonacci(n);
        
        System.out.print("Output: [");
        for (int i = 0; i < fibonacciSeries.length; i++) {
            System.out.print(fibonacciSeries[i]);
            if (i < fibonacciSeries.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }

    public static int[] generateFibonacci(int n) {
        if (n <= 0) return new int[0];
        if (n == 1) return new int[]{0};
        
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
}
