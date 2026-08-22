public class Arraystatistics {

     public int sum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

     public double average(int[] values) {
        double s = sum(values);
        double av = s / values.length;

        return av;
    }
   public int minimum(int[] values) {
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
} 
   public int maximum(int[] values) {
        int max = values[0];

       for (int i = 1; i < values.length; i++) {
          if (values[i] > max) {
              max = values[i];
        }
    }

    return max;
}   
public int countEven(int[] values) {
    int count = 0;

    for (int i = 0; i < values.length; i++) {
        if (values[i] % 2 == 0) {
            count++;
        }
    }

    return count;
}

public int countOdd(int[] values) {
    int cod = 0;

    for (int i = 0; i < values.length; i++) {
        if (values[i] % 2 != 0) {
            cod++;
        }
    }

    return cod;
}
}

    


     
    


