package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsTest {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("harsh", 123);
    map.put("sadasd", 3123);
    map.put("sdsdasd", 123);
    System.out.println(map.get("sddda"));

    // traversal for map
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    System.out.println("---------");
    // iterating keys
    Set<String> keySets = map.keySet();
    for (String key : keySets) {
      System.out.println(key + "," + map.get(key));
    }

  }

}
