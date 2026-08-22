public class ArrayTransformations {
  

    public static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    public static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    public static int removeValue(int[] values, int target) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[count] = values[i];
                count++;
            }
        }

        return count;
    }

    public static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
            result[i] = sum;
        }

        return result;
    }
}

