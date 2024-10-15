<h1>Deque</h1>

- interface extends the queue interface to allow double ended queues with following methods
- it allow operation not just head but at it's tail as well

<h2>Methods </h2>

1. boolean add(E element)
2. boolean offer(E element)
3. E poll()
4. E remove()
5. E peek()
6. E Element()

add and offer has 2 types of methods

- one is offerFirst and offerLast(offer() i synonym for it)
- addFirst(push() is synonum for it) and addLast

same way for removing

- pollFirst()(poll() is synonym for it) and pollLast()
- removeFirst()(pop() is synonym for it) and removeLast()

for examine the deque

- E peekFirst() eq. to peek()
- E peekLast()
- E getFirst() eq. to element()
- E getLast()
