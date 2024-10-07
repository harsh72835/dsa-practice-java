<h1>NavigableSetInterface</h1>

- extends teh sorted interface with navigation methods to find the closest matched for specific search targets
- by navigation, we mean operations taht requires searching for elements in the naviagable set
- in the absence if elements, these operations return null rather than throw a NoSuchElementException.
- Inadddition to the rounds of the SortedInterface, the naviagableSet interface adds the following new methods

First -last methods

1. E PollFirst()
2. E PollLast()

closest matched

1. E ceiling(E e)
2. E floor(E e)
3. E higher(E e)
4. E Lower(E e)



// this is used for range model based quetions 