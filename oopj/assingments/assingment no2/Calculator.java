
    import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display shape options
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        
        // Read user choice
        System.out.print("Enter the number corresponding to the shape: ");
        int choice = scanner.nextInt();
        
        double area;
        
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.printf("The area of the circle is: %.2f%n", area);
                break;
                
            case 2: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.printf("The area of the square is: %.2f%n", area);
                break;
                
            case 3: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.printf("The area of the rectangle is: %.2f%n", area);
                break;
                
            case 4: // Triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.printf("The area of the triangle is: %.2f%n", area);
                break;
                
            default:
                System.out.println("Invalid selection. Please enter a number between 1 and 4.");
                break;
        }
        
        scanner.close();
    }
}


