package CollectionTypes.Sets.TreeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
  public static void main(String[] args) {
    Set<Integer> ts = new TreeSet<>();
    ts.add(12312);
    ts.add(213);
    ts.add(12);
    ts.add(1);

    System.out.println(ts); // this gives sorted set because it implements the sortedSet

    NavigableSet<Integer> set = new TreeSet<>();
    set.add(8);
    set.add(3);
    set.add(1);
    set.add(0);

    System.out.println(set.lower(5));
    System.out.println(set.ceiling(5));
    System.out.println(set.floor(5));
    System.out.println(set.higher(5));

  }

}
