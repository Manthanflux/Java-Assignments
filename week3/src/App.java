// // public class App {
// //     public static void main(String[] args) {

// //         Arraystatistics as = new Arraystatistics();

// //         int[] arr = {1, 2, 3, 4};

// //         int sum = as.sum(arr);
// //         double av = as.average(arr);
// //         int min = as.minimum(arr);
// //         int max = as.maximum(arr);
// //         int count = as.countEven(arr);
// //         int cod = as.countOdd(arr);
       

// //         System.out.println("Sum = " + sum);
// //         System.out.println("Average = " + av);
// //         System.out.println("Minimum = "+ min);
// //         System.out.println("Maximum=" + max);
// //         System.out.println("Even=" + count);
// //         System.out.println("Odd=" + cod);

// //     }
// // }
// // public class App {
// //     public static void main(String[] args) {

// //         LinearSearchToolkit as = new LinearSearchToolkit();

// //         int[] arr = {2, 5, 3, 5, 7, 5};
// //         int target = 5;

// //         boolean found = as.contains(arr, target);
// //         int first = as.firstIndexOf(arr, target);
// //         int last = as.lastIndexOf(arr, target);
// //         int count = as.countOccurrences(arr, target);

// //         System.out.println("Contains = " + found);
// //         System.out.println("First Index = " + first);
// //         System.out.println("Last Index = " + last);
// //         System.out.println("Occurrences = " + count);
// //     }
// // } 
// public class App {
//     public static void main(String[] args) {

//         ArrayTransformations as = new ArrayTransformations();

//         int[] arr = {1, 2, 3, 4, 5};

//         as.reverseInPlace(arr);

//         System.out.println("Reverse:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         int[] copy = as.reversedCopy(arr);

//         System.out.println("\nReversed Copy:");
//         for (int i = 0; i < copy.length; i++) {
//             System.out.print(copy[i] + " ");
//         }

//         int[] values = {2, 5, 3, 5, 7};

//         int length = as.removeValue(values, 5);

//         System.out.println("\nAfter Remove:");
//         for (int i = 0; i < length; i++) {
//             System.out.print(values[i] + " ");
//         }

//         int[] numbers = {1, 2, 3, 4};

//         int[] sum = as.runningSum(numbers);

//         System.out.println("\nRunning Sum:");
//         for (int i = 0; i < sum.length; i++) {
//             System.out.print(sum[i] + " ");
//         }
//     }
// }
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BitMaskUtility as = new BitMaskUtility();

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = sc.nextInt();

        if (position < 0 || position > 31) {
            System.out.println("Invalid position");
            return;
        }

        System.out.println("1. Check Bit");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Toggle Bit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.println("\nBefore:");
        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + as.toBinary32(number));

        if (choice == 1) {

            boolean result = as.isBitSet(number, position);
            System.out.println("Bit is set: " + result);

        } else if (choice == 2) {

            int result = as.setBit(number, position);
            System.out.println("\nAfter:");
            System.out.println("Decimal: " + result);
            System.out.println("Binary: " + as.toBinary32(result));

        } else if (choice == 3) {

            int result = as.clearBit(number, position);
            System.out.println("\nAfter:");
            System.out.println("Decimal: " + result);
            System.out.println("Binary: " + as.toBinary32(result));

        } else if (choice == 4) {

            int result = as.toggleBit(number, position);
            System.out.println("\nAfter:");
            System.out.println("Decimal: " + result);
            System.out.println("Binary: " + as.toBinary32(result));

        } else {
            System.out.println("Wrong choice");
        }

        sc.close();
    }
}