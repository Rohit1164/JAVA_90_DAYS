import java.util.Queue;
import java.util.LinkedList;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue); // [10, 20, 30]

        System.out.println(queue.remove()); // 10
        System.out.println(queue.peek()); // 20
    }
}
