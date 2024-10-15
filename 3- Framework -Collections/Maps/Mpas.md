<h1>Maps</h1>

- map defines mapping from keys to values
- the <key,value> pair is called an entery
- map does not allow duplicate keys , they keys are unique
- both the keys and values must be objects, with primitive values being wrapped in their respective primitive wrapeer objects when they are put in a map
- a map is not a collection and the map interface does not extend the collection interface
- the mapping can be viewed as a collection in various ways: a key set, a vlaue collection, or an entery set

<h2>Methods</h2>

1. Object put(k key, V value)
2. Object get(Object key)
3. Object.remove(Object key)
4. boolean containsKey(Object key)
5. boolean containsValue(Object value)
6. itn size()
7. boolean isEmpty()

<h2>Bulk operations</h2>

1. void putAll(Mpa<? extends K, ? extends V> map)
2. void clear()
3. Set<K> keySet()
4. Collection<V> values()
5. Set<Map.Entry<K,V>> entrySet()

---

```
interface Entry<K,V> {
  K getKey();
  V getValue();
  V setValue (V value);
}
```

- Each <key,value> in the entry set view is represented by an object implementing the nested map.
- An entry in the entry set view can be manipulated by methods defined in this interface

<h3>Impplementations</h3>

- the classses hashmap and hastable implement unordered maps. the class linkedHashmap implements ordered mpas
- the class treemap implements sorted maps
- while the hashmap class is not thread-safe and permits one null key, the hashtable class is thread-safe and permits non-null keys and values only
- the thread-safety provided by the hashtable class comes with a performance penalty.
- however, a linkedhashmap can also maintain its elements in (element) access order, that is, the order in which its entries are accessed, from least -recently accessed to most accessed entries
- the ordering mode can be specified in opnce of the constructors of the LinkedHashMap class(LRU cache)
- both the hasmap and the linkedhashmap classes provide comprable performance,but the hashmap class is the natural choice if ordering is not an issue.
  Operations such as adding, removing or finding an entry based on a key are in constance time. as these hash the key
- Operations such as finding the entry with a particular vvalue are in linear time as these involve searching through the entries
- adding, removing and finding entries in a linkedhashmpa can be slightly slower than hashmap, as an ordered doubly linked-inked has to bemaintained
- traversal of ampa is through one of its collection views.. For an underlying LinkedHashMap, teh traversal time is proportional to the size of the map- regardles of its capacity
