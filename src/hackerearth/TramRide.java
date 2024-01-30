package hackerearth;

import java.util.*;

public class TramRide {
    static long calculateCost(int size, int start, int end, int[] arr) {
        int cost = 0;
      for(int i=start;i<end;i++) {
          cost += arr[i];
      }
      return cost;
    }
    static void solve(int size, int start, int end, int[] arr){
        if(end < start) {
            int temp = end;
            end = start;
            start = temp;
        }
        long clockCost = calculateCost(size, start, end, arr);
        for (int i = 1, j = arr.length; i < j; i++, j--) {
            // Swap elements at positions i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=1;i<arr.length;i++)
            System.out.print(arr[i]);
//        long antiClockCost = calculateCost(size, end, start, arr);
//        System.out.println(clockCost);
//        System.out.println(antiClockCost);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] arr = new int[size+1];
        for(int i=1;i<=size;i++)
            arr[i] = sc.nextInt();
        solve(size, start, end, arr);
    }
}
