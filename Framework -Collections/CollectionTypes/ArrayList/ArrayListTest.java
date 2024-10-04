package CollectionTypes.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    List<Integer> alist = new ArrayList<>();
    alist.add(1);
    alist.add(22);
    alist.add(3);

    alist.set(1, 25);

    List<Integer> blist = new ArrayList<>(alist);
    // blist.addAll();
    blist.add(2313131);

    blist.addAll(alist); // merge two list
    int index = alist.indexOf(1); // get the index of element

    List<Integer> aList3 = alist.subList(1, 3); // sublist is shallow copy
    aList3.set(0, 1000000);
    System.out.println(aList3);

    System.out.println("asdsd" + blist + alist + index);

    for (int x : alist) {
      System.out.println(x);
    }
  }
}
