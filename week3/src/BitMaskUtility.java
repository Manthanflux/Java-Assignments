public class BitMaskUtility {

    public static boolean isBitSet(int number, int position) {
        int mask = 1 << position;

        if ((number & mask) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int setBit(int number, int position) {
        int mask = 1 << position;
        return number | mask;
    }

    public static int clearBit(int number, int position) {
        int mask = 1 << position;
        return number & ~mask;
    }

    public static int toggleBit(int number, int position) {
        int mask = 1 << position;
        return number ^ mask;
    }

    public static String toBinary32(int number) {
        String binary = "";

        for (int i = 31; i >= 0; i--) {
            if ((number & (1 << i)) != 0) {
                binary = binary + "1";
            } else {
                binary = binary + "0";
            }
        }

        return binary;
    }
}
