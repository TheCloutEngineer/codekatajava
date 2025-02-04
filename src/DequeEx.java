import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> deque1 = new LinkedList<>();
        Deque deque3 = new ArrayDeque();

//        deque3.offer(Integer.valueOf(123));
        deque.offer("Hello, Deque");

        Integer el = (Integer) deque3.poll();

        String el2 = (String) deque3.poll();


        // Queue mode

    }
}
