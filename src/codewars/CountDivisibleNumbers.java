package codewars;

public class CountDivisibleNumbers {
    public static long check(long x, long y, long k){
        if(x > y) {
            long temp = x;
            x = y;
            y = temp;
        }
        if(x == y) {
            if(x % k == 0)
                return 1;
        }
        return (long)Math.ceil((double)(y-x)/k);
//        if (y % k == 0 && x % k == 0)
//        return (int)Math.ceil((double)(y-x)/k) + 1;
//        else return (int)Math.ceil((double)(y-x)/k) - 1;
    }
    public static void main(String[] args) {
        //2 4 6 8 10 12 13
        System.out.println(check(101, Long.MAX_VALUE, 11));
        //System.out.println((int)Math.ceil((double)(15-2)/2));
    }
}
