package CollectionFrameWork;

import java.util.ArrayList;

public class CollectionInterfaceExmple {
}
/*
1). Collection is an interface which is present in java.util package

2). Syntax of Collection:

            public interface Collection<E> extends Interface<E>
            {
            ---
            ----
            }

   3). Hierarchy of collection interface
   4). Methods of collection interface
                -public boolean add(Object obj)
                -public boolean addAll(Collection c)
                -public boolean remove
                -boolean contains(object obj)
                -boolean isEmpty()
                -int size()




 */

class CollectionDemo
{
    public static void main(String [] args)
    {
        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add("ferdous");
        a1.add('m');

        System.out.println(a1);


        ArrayList a2 = new ArrayList();
        a2.add(500);
        a2.add("You");
        a2.add(798);

        a2.addAll(a1);
        System.out.println(a2);
        System.out.println(a1.contains(798));
    }
}