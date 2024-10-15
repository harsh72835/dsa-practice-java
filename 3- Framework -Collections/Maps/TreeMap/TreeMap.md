<h2>TreeMap</h2>

- treemap class implements the NavigableMap interface, and thereby the SortedMapInterface 
- by default , opertaions on sortedMpas rely pon the natural ordering of the keys
- however, a total ordering can be specified by passing a customized comparator to constructor
- TreeMap implementation uses balanced trees, which deliver excellent performacne for all operations.
- However, searching in a HashMap can be faster than in a TreeMap, as hashing algorithms usually offer better performance than teh search algorithms for balanced trees. 