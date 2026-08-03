public class q3 {public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest = (principal * rate * time)/ 100;
        double finalAmount = principal + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Final Amount = " + finalAmount);
    }
    
}
