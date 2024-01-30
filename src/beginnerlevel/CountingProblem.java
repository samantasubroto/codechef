package beginnerlevel;

import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int size = sc.nextInt();
            int countOdd = 0;
            int countEven = 0;
            for(int i=0;i<size;i++) {
                int value = sc.nextInt();
                if(value % 2 == 0)
                    countEven++;
                else countOdd ++;
            }
            if(size != 2 && countEven == countOdd)
                System.out.println("YES");
            else if(size == 2 && countOdd == 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}


//not completed