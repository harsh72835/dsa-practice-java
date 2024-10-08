package CollectionTypes.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityqueueTest {
  public static void main(String[] args) {

    // natural ordering using without using comaprator
    // PriorityQueue<Integer> pq = new PriorityQueue<>();

    // total ordering
    // PriorityQueue<Integer> pq = new PriorityQueue<>(new
    // MyCustomInegerComparator());

    // using lambda operator in java so we don't have to implement our own
    // comparator class
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    pq.offer(1);
    pq.offer(3);
    pq.offer(2);
    pq.offer(12312);
    pq.offer(123);

    while (!pq.isEmpty()) {
      System.out.println(pq.peek());
      pq.poll();
    }

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

    System.out.println(li); // bottom 2 elements
    System.out.println(pq);

    // what if we want top2 elements of bottom with custom class ??
    // below is the example

    /* get me the two top 3 students according to the physics marks */

    PriorityQueue<StudentMarks> spq = new PriorityQueue<>();
    spq.add(new StudentMarks(53, 93));
    spq.add(new StudentMarks(10, 20));
    spq.add(new StudentMarks(20, 60));
    spq.add(new StudentMarks(30, 80));
    spq.add(new StudentMarks(50, 100));

    PriorityQueue<StudentMarks> topMarks = new PriorityQueue<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());
    for (StudentMarks sm : spq) {
      topMarks.add(sm);
    }

    List<StudentMarks> top3 = new ArrayList<>();
    int index1 = 0;
    while (!topMarks.isEmpty()) {
      if (index1 == 3) {
        break;
      }
      top3.add(topMarks.poll());
      index1++;
    }

    // above code will throw an exception like below
    // ** Exception in thread "main" java.lang.ClassCastException: class
    // ** CollectionTypes.PriorityQueue.StudentMarks cannot be cast to class
    // ** java.lang.Comparabl (CollectionTypes.PriorityQueue.StudentMarks is in
    // ** unnamed module of loader 'app'; java.lang.Comparable is in module
    // ** java.base of loader 'bootstrap'

    // to get the above exception remove the compareTo() method and comaprable
    // interface

    // to resolve the above error the studentMarks class has to implement the
    // Comparable interface

    System.out.println(top3); //
  }

}
