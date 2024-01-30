package beginnerlevel;

import java.util.Scanner;

public class DigitSumParities {
    
    public static int addition(int num){
        int result = 0;
        while(num != 0) {
            result += num % 10;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int num = sc.nextInt();
            boolean isEven = num % 2 == 0;
            while(!isEven) {
                int value = addition(++num);
                isEven = value % 2 != 0;
            }
            System.out.println(num);
        }
    }
}
