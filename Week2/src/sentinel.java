import java.util.Scanner;

public class sentinel {

    // Checks whether the mark is valid
    static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    // Calculates the average
    static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    // Prints the results
    static void printResults(int count, int sum, int highest, int passes, int failures) {

        System.out.println("\n--- Results ---");
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average mark: " + calculateAverage(sum, count));
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = -1;
        int passes = 0;
        int failures = 0;

        while (true) {

            System.out.print("Enter mark (-1 to stop): ");
            int mark = sc.nextInt();

            // Sentinel: stop the loop
            if (mark == -1) {
                break;
            }

            // Reject invalid marks
            if (!isValidMark(mark)) {
                System.out.println("Invalid mark. Please enter 0 to 100.");
                continue;
            }

            // Process valid mark
            count++;
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark >= 50) {
                passes++;
            } else {
                failures++;
            }
        }

        printResults(count, sum, highest, passes, failures);

        sc.close();
    }
}