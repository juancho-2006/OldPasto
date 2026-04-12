import java.util.Scanner;
public class calcu {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("====CALCULATOR====");
        System.out.println("1. Addition"); 
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();  
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please select a valid option.");
            return;
        }
        else if (choice == 1){
            System.out.println("Let's perform addition. Enter two numbers please: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            double result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 2){
            System.out.println("Let's perform subtraction. Enter two numbers please: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            double result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 3){
            System.out.println("Let's perform multiplication. Enter two numbers please: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            double result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if (choice == 4){
            System.out.println("Let's perform division. Enter two numbers please: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();
            if (num2 == 0 || num1 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }
    }
}
