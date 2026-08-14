
    import java.util.Scanner;

public class primenumber {

    static boolean isPrime(int number) {

        // Values less than 2 are not prime
        if (number < 2) {
            return false;
        }

        // Check divisors only while divisor * divisor <= number
        for (int divisor = 2; divisor * divisor <= number; divisor++) {

            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        sc.close();
    }
}

