package beginnerlevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Attendence {
    public static String isEligible(String attendence) {
        String present = attendence.replaceAll("0", "");
        int remainingDays = (120 - attendence.length());
        int percentage = (int) ((((double) present.length() + remainingDays) / 120) * 100);
        return percentage >= 75 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int size = sc.nextInt();
            sc.nextLine();
            String attendence = sc.nextLine();
            System.out.println(isEligible(attendence));
        }
    }
}
