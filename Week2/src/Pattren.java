import java.util.Scanner;

public class Pattren {

    // Pattern A
    static void patternA(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Pattern C
    static void patternC(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        if (size < 1) {
            System.out.println("Size must be at least 1.");
        } else {

            System.out.println("Pattern A:");
            patternA(size);

            System.out.println();

            System.out.println("Pattern C:");
            patternC(size);
        }

        sc.close();
    }
}