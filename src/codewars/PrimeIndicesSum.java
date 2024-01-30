package codewars;

public class PrimeIndicesSum {

    public int sum(int[] arr) {
        int total = 0;
        for(int i=0;i<arr.length;i++) {
            if(isPrime(i)){
                total += arr[i];
            }
        }
        return total;
    }

    public static boolean isPrime(int num) {
        if(num<=1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
