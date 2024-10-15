package CollectionTypes.PriorityQueue;

import java.util.Comparator;

public class MyCustomInegerComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o2 - o1; // descending order
  }
}
