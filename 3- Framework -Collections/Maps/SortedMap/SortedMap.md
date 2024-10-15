<h2>SortedMap</h2>

- the SortedMap and NavigableMap interfaces are teh analogs of the SortedSet and the NavigableSet Interfaces respectively
- the SortedMap interface extends the Map interface to proveide the functionality for implementing maps with sorted keys.. its operations are analogous to those of the SortedSetInterface.

<h2>Interface methods</h2>

1. K firstKey() Sorted set: first()
2. K lastKey() Sorted set: last()

---

<h2>Navigable Map</h2>

- navigableMap interface extends the SortedMap interface with navigation methods to find closest matches for specific search targets
- In addition to the methods of the SortedMap Interface, the navigableMap interface adds the new Methods, anlogous to the NavigableSet Interface
- first-last elements

  1. Map.Entry<K,V> pollFirstEntry() <-> Navigable set: pollFirst()
  2. Map.Entry<K,V> pollLastEntry() <-> Navigable set: pollLast()
  3. Map.Entry<K,V> firstEntry()
  4. Map.Entry<K,V> lastEntry()

- closest Matches

  1. Map.Entry<K,V> ceilingEntry(K key) <-> Navigable set: ceiling()
  2. K celingKey(K key)
  3. Map.Entry<K,V> floorEntry(K key) <-> Navigable set: floor()
  4. K floorKey(K key)
  5. Map.Entry<K,V> higherEntry(K key) <-> Navigable set: higher()
  6. K higherKey(K key)
  7. Map.Entry<K,V> lowerEntry(K key) <-> Navigable set: lower()
  8. K lowerKey(K key)
