package CollectionFrameWork;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStructure {
}
/*
Q: What is data Structure?
Ans. Data Structure is way by which we can store the data in efficient way. As We can retrieve and access.
Tje efficient is the matter of time and space.

Types of data Structure:
1) Primitive Data Structure
    In Primitive Data Structure, we have (Boolean, char, byte,short, int, long, float, double)
2). Non-primitive DS
    Non-primitive DS is two types:
        a). Linear DS b). Non-Linear DS

        Example of Linear DS: String, Arrays, List, Set, Queue, ArrayList, LL, HS< LHS etc.
        Example of Non-Linear DS: Graphs and trees.

Primitive DS is very simple but our concentration on Non-Primitive type, where with one command we can Millions of data.
Example: in an array or ArrayList by one variable we can store lots of datas.


uses of Primitive DS: Calculator, snake game, currency converter
uses of non-Primitive DS: Social media, banking website, e-commerce, for access of these all website or application we
need to use data structure and algorithm.

Collection framework:
For using all the non-primitive DS we need a big structure where we can handle varieties of data.
 Collection framework is a predefined API which is provided by JAVA.


 Q: What is the difference between Arrays and Collection Framework:

 Ans:

 Arrays:
 1). Arrays can store primitive and non-primitive (object) types of data.
    such as;  int [ ] a = {10, 20, 30}
    or we can store object; Test [ ] = { obj1, obj2, obj3, obj4,........}
 2). Array can store only homogeneous data, (same type).
 3). Array size is fixed, we cannot increase or decrease the size of an array at runtime.
 4). Array are inbuilt feature of java & thus we have to develop algorithm


 Collection Framework:
 1). Collection framework can contain only non-primitive type of data. Example: in an arrayList, if we use a.add[10];
    here 10 is not an int it is an object. here 10 is an object not an int. It is Integer, wrapper class of int.
 2). We can store heterogeneous (different) type of data.
 3). We can increase of decrease the size of collections at runtime.
 4). Collection framework is an API which provides predefined classes, interfaces and Methods.



 Collection Framework:
 It is an API.
 Collection represents, it is the single entity or object which can store multiple data.
 framework represents, it is the set of predefined classes & interfaces which is used to store multiple data.
 It contains 2 main parts, a). java.util.Collection  b). java.util.Map

 In collection, we can enter date directly but in Map we can store data as a key value form.


 Hierarchy of collection and Map:
 Collection:
 Collection are 3 types, a). List  b). Set  c). Queue   these are interface
 'List' divided into 4 types, 1). ArrayList (class) 2). LinkedList (class)  3). Vector (Legacy Class)  4). Stack (Legacy Class).
 'set' divided into 5 types, 1). Hashset (class) 2). LinkedHashset  (class)  3). SortedSet(interface)  4). NavigatedSet (interface)
                                5). Treeset (class)
 'Queue' divided in 3 types 1). priorityQueue 2). Deque  3). ArrayDequeue.

 Map:

 map is divided into 10 parts:
 1). HashMap (Class) 2). LinkedHashmap (Class) 3). identityHashMap (Class) 4). WeakHashMap (Class) 5). SortedHashMap interface)
  6). NavigatedMap interface)  7). TreeMap (Class)  8). Dictionary (Class)  9). Hashtable (Class)  10). Properties (Class)

Data structure and algorithm:
 */
class Exp
{
public static void main(String[] args)
{
    ArrayList a1 = new ArrayList();

    a1.add(10); // here 10 is object. Where main object is ArrayList, inside this ArrayList object, all object (10, ferdous and ture)
    a1.add("ferdous");
    a1.add (true);
    System.out.println(a1);


    HashMap inm = new HashMap();
    inm.put(101, "Aarad");
    inm.put(102, "Aqsa");
    inm.put(103, true);

    System.out.println(inm);
}
}