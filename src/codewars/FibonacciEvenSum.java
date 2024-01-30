package codewars;

public class FibonacciEvenSum {
    public static long fibonacci(long max) {
        int a = 0, b = 1, c;
        long total = 0;
        while(b < max) {
            if(b % 2 == 0)
                total += b;

            c = a + b;
            a = b;
            b = c;

        }
        return total;
    }

    public static long recfibonacci(long max) {
        if((max==0)||(max==1))
            return max;
        return fibonacci(max-2)+fibonacci(max-1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(25997544));
    }
}
