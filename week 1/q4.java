public class q4 {
     public static void main(String[] args) {
        int number = 572;

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Units: " + units);
    }
}
