package beginnerlevel;

import java.util.Scanner;

public class CovidTheater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            if(row > 1 && row%2==0) {
                row = row/2;
            }
            int tickets = (int) (row + Math.ceil((double)column/2));
            System.out.println(tickets);
        }
    }
}
