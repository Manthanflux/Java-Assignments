import java.util.Scanner;

public class Reversenumber {

    static int reverseNumber(int number) {

        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int answer = reverseNumber(number);

        System.out.println("Reversed number is " + answer);

        sc.close();
    }
}