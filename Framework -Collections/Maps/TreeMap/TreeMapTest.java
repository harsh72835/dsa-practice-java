package Maps.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
  public static void main(String[] args) {

    NavigableMap<Integer, String> tmap = new TreeMap<>((a, b) -> b - a);
    tmap.put(123, "harsh");
    tmap.put(124, "sadasd");
    tmap.put(125, "sdsdasd");

    System.out.println(tmap);

    Set<Map.Entry<Integer, String>> entrySet = tmap.entrySet();
    for (Map.Entry<Integer, String> entry : entrySet) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    System.out.println(tmap.pollFirstEntry());
    System.out.println(tmap.ceilingKey(126));
  }
}
