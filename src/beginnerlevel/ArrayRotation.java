package beginnerlevel;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int size = sc.nextInt();
            int shift = sc.nextInt();
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < size; i++) {
                deque.addLast(sc.nextInt());
            }
            while (shift-- != 0) {
                int value = deque.removeLast();
                deque.addFirst(value);
            }
            deque.stream().forEach(value -> {
                System.out.print(value + " ");
            });
        }
    }
}
