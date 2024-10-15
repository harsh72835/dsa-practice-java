package CollectionTypes.Sets.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import CollectionTypes.PriorityQueue.StudentMarks;

public class LinkedHashSetTest {
  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(4);
    set.add(5);
    set.add(7);
    set.add(2);
    // System.out.println(set);
    System.out.println(set.contains(1));
    System.out.println(set.contains(200));

    Set<Integer> set1 = new LinkedHashSet<>();
    set1.add(1);
    set1.add(4);
    set1.add(5);
    set1.add(7);
    set1.add(9);
    // System.out.println(set1);

    Set<StudentMarks> stm = new HashSet<>();
    stm.add(new StudentMarks(53, 93));
    stm.add(new StudentMarks(10, 20));
    stm.add(new StudentMarks(20, 60));
    stm.add(new StudentMarks(30, 80));
    stm.add(new StudentMarks(50, 100));

    for (StudentMarks st : stm) {
      System.out.println(st);
    }

    System.out.println(stm.contains(new StudentMarks(53, 93))); // this will give false despite it is ther in hashset

    // because for every element the hasvalue is generated and it compares throguh the hasvalue 
    // so for every custom class we have to implement the custom class's hasCode() method 
  }

}
