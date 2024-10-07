package CollectionTypes.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityqueueTest {

  public static void main(String[] args) {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(1);
    pq.offer(3);
    pq.offer(2);
    pq.offer(12312);
    pq.offer(123);

    // while (!pq.isEmpty()) {
    // System.out.println(pq.peek());
    // pq.poll();
    // }

    // get top 2 elements from priority queue and add into list
    List<Integer> li = new ArrayList<>();
    int index = 0;
    while (!pq.isEmpty()) {
      if (index == 2) {
        break;
      }
      li.add(pq.poll());
      index++;
    }

    System.out.println(li);
    System.out.println(pq);
  }

}
