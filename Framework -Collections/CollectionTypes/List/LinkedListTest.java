import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        System.out.println("Asdad");
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(231);
        list.add(123123);

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.next()); // next method return the element first and then increase own value index++
        System.out.println(iterator.next());
        System.out.println(iterator.previous()); // previous method decrease own vlaue first then return the value
                                                 // --index
    }
}