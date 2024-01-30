import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            int count = 0;
            while (n != 0) {
                n = (int) Math.floor(n / e);
                count++;
            }
            System.out.println(n);
        }

    }
}
