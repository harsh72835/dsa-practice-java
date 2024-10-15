package CollectionTypes.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
  public static void main(String[] args) {
    // FIFO queue
    Queue<Integer> q = new LinkedList<>();
    q.offer(1);
    q.offer(2);

    System.out.println(q.peek());
    System.out.println(q.poll());
    System.out.println(q.peek());
    System.out.println(q.isEmpty());

    // LIFO stack
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    while (!stack.isEmpty()) {
      System.out.println(stack.peek());
      stack.pop();
    }

    // Deque - arrayDeque class
    // because with arrayDeue we can push the value at any point
    // that's why we use arrayDeue for deque
    Deque<Integer> deq = new ArrayDeque<>();
    deq.offer(2);
    deq.offer(4);
    deq.offerFirst(1);
    deq.offerLast(5);

    deq.pollLast();
    System.out.println(deq);

  }
}
