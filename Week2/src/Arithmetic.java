import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Answer = " + (a + b));
        } else if (choice == 2) {
            System.out.println("Answer = " + (a - b));
        } else if (choice == 3) {
            System.out.println("Answer = " + (a * b));
        } else if (choice == 4) {
            System.out.println("Answer = " + (a / b));
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
       


 
