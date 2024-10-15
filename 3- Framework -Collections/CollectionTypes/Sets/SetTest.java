package CollectionTypes.Sets;

import java.util.HashSet;

public class SetTest {
  public static void main(String[] args) {

    // Hash set implementation
    HashSet<Integer> hs = new HashSet<>();
    hs.add(2);
    hs.add(3);
    hs.add(4);

    System.out.println(hs);

    // hs.retainAll(hs) -- give me intersection of two set or intersection between
    // set and any collection
    // the original set will be changed with retainAll() method

  }

}
