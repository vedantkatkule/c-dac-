
    import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    // Static fields
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    // Non-static fields
    private int id;
    private String name;
    private double salary;

    // Static initializer
    static {
        // Initialize static fields if needed
    }

    // Non-static initializer
    {
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        // Update total salary expense when a new employee is added
        totalSalaryExpense += salary;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Update total salary expense when the salary changes
        totalSalaryExpense -= this.salary;
        this.salary = salary;
        totalSalaryExpense += this.salary;
    }

    // Static method to get total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply raise to all employees
    public static void applyRaise(ArrayList<Employee> employees, double percentage) {
        for (Employee emp : employees) {
            double newSalary = emp.salary + (emp.salary * percentage / 100);
            emp.setSalary(newSalary);
        }
    }

    // Static method to calculate total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

   
    public void updateSalary(double newSalary) {
        setSalary(newSalary);
    }

    // toString method for representation
    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Salary: %.2f", id, name, salary);
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Raise to All Employees");
            System.out.println("3. Calculate Total Salary Expense");
            System.out.println("4. Update Salary of an Employee");
            System.out.println("5. Display Employee Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(id, name, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.print("Enter percentage raise: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(employees, percentage);
                    System.out.println("Raise applied successfully.");
                    break;

                case 3:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 4:
                    System.out.print("Enter employee ID to update salary: ");
                    int empId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee emp : employees) {
                        if (emp.getId() == empId) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated successfully.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Employee Details:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}


