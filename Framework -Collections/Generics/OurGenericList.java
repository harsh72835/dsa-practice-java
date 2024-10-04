package Generics;

import java.util.Iterator;

public class OurGenericList<T> implements Iterator<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    // private because I don't want to disclose this methods to anyone
    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;

        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return index < list.size();

        }

        @Override
        public T next() {
            return list.items[index++];

        }

    }
}