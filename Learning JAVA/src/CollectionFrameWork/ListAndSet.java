package CollectionFrameWork;

import java.util.*;

public class ListAndSet {
}
/*
Q: What is the difference between list and set?
Ans:

List:
1). List is an index based data structure
2). List can store duplicate elements.
3). List can store any number of Null values.
4). List follows the insertion order.
5). We can iterate (get)the list elements by Iterator & ListIterator

Set:
1). Set is not an index-based data structure, it stored data according to the Hashcode value.
2). Set does not allowed to store duplicate element.
3). Set can store only one Null value.
4). Set does not follow the insertion order.
5). We can iterate the set elements by Iterator.



 */
/*
class ListDemo
{
    public static void main(String [] args)
    {
        List l = new ArrayList() ;
        {
            l.add(360); // it will store in the 0 index position, we can also write l.add(0, 360), if we write (2, 360)
                                // it will show exception, because it will give input sequentially.
            l.add(1, 87); // see the example
            //l.add(5, 3); // it will show exceptions.

            // it is called index-based insertion.

            // in list we can iterate in forwarding and backward direction.
        }
    }

}

class SetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(30);
        s.add(89);
        s.add(89);
        s.add(200);

        Iterator irt = s.iterator();
        while (irt.hasNext())
        {
            System.out.println(irt.next()); // from this out put we can see that last one will print first and remove all duplicate values
        }


    }
}

/*
Cursor:

3 Types of data available in Java
    1). Iterator
    2). ListIterator
    3). Enumeration


Q: What is Enumeration?
Ans.
1). Enumeration is the cursor which is used to retrieve collection object one by one.
2). Enumeration was introduced in JDK 10 version.
3). Enumeration cursors can be used only with legacy classes i.e. vector & Stack
4). Enumeration cursor can be got by elements() method
            Example: Enumeration e = v.element()
5). Method of enumeration cursor are:
        hasMoreElement(), nextElement()
6). Enumeration cursor can be used to retrieve the element only in forward direction.
7). Enumeration cursor can be used only for read operation.


 */

class Test45
{
    public static void main(String [] args)
    {
        Vector v = new Vector();
        v.add(10);
        v.add("Aqsa");
        v.add(6.7);

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
// This is used rarely.