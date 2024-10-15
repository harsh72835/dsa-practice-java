package Generics;

import java.util.Iterator;

class CollectionTest {

    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print(list);

        // this is implemented ib GenericList.java
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }

    }
}