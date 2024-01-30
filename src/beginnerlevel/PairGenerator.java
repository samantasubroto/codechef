package beginnerlevel;

import java.util.Arrays;

public class PairGenerator {
    public static void main(String[] args) {
        int[] array = {-3, 2, 3, -4, 3, 1};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int itterate = countPairs(array.length - i);
            max = Math.max(max, addition(Arrays.copyOfRange(array, i, i + itterate + 1)));
        }
        System.out.println(max);
    }

    public static int addition(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result += arr[i];
        return result;
    }

    public static int countPairs(int n) {
        if (n == 1) {
            return 0;
        }
        return 1 + Math.min(n - 2, 1);
    }


}
