import java.util.Scanner;

public class GradingSystem {
    
    public void PrintGrades()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark");
        } else if (mark >= 80) {
            System.out.println("Distinction");
        } else if (mark >= 70) {
            System.out.println("Merit");
        } else if (mark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}