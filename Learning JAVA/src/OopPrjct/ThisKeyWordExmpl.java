package OopPrjct;
/*
Q: What is this key word?
In Oops there is an object. The variable which refers to that object is called reference variable.  "this" keyword is the
reference variable that refers to the current object.

uses of "this" keyword:

1. this keyword can be uses to refer current class instance variable.
2. this keyword can be used to invoke current class method (implicitly).
3. this() can be used to invoke current class constructor.
4. this can be used to pass as an argument in the method call.
5. this can be used to pass as an argument in the constructor call.
6. this can be used to return the current class instance from the method.

Note that if we don't use the 'this' keyword, compiler automatically adds this keyword while invoking the method.


 */

// 1. this keyword can be uses to refer current class instance variable.
public class ThisKeyWordExmpl {
}
/*class Test2
{
    int i; //1. this keyword can be uses to refer current class instance variable.
    void setValues(int i)
    {
        this.i=i; // 'this' keyword refers to current class instance variable.
    }
    void show()
    {
        System.out.println(i);
    }

}
class Xyz
{
    public static void main(String [] args)
    {
        Test2 t1 = new Test2();
        t1.setValues(10);
        t1.show();
        System.out.println();
    }*/

//2. this keyword can be used to invoke current class method (implicitly). Example:
/*
class ThisDemo
{
    void display()
    {
        System.out.println("Hello");

    }
    void show()
    {
        this.display(); // same as display(); // here, this keyword can be used to invoke current class method (implicitly).
    }
    public static void main(String [] args)
    {
        ThisDemo td = new ThisDemo();
        td.show();
    }
}
*/

// 3. this() can be used to invoke current class constructor. Example:

/*
class ThisDemo
{
    ThisDemo() // Making a constructor
    {
        //this(34);// this will call parameterized constructor from here.
        System.out.println("No argument constructor");

    }
    ThisDemo(int a)
    {
        this();// this will call non-parameterized constructor from here.
        System.out.println("Parameterized Constructor");
    }
    public static void main(String [] args)
    {
        ThisDemo td = new ThisDemo(); // if we don't put any value here it will call 'No argument constructor', if we
        // put any integer as an argument, it will call parameterized constructor.


    }
}

 */

//4. this can be used to pass as an argument in the method call. Example:
/*
class ThisDemo
{
    void m1(ThisDemo td)
    {
        System.out.println("I am in m1 method");

    }
    void m2()
    {
        m1(this); // here 'this' is used as an argument to call a method.
    }
    public static void main(String [] args)
    {
        ThisDemo td = new ThisDemo();
        td.m2(); // without this line it will not print anything. This line will call m2 method, but m1 is calling m1.
        // so the output will be from m1 method, "I am in m1 method".
    }
}

*/
// 5. this can be used to pass as an argument in the constructor call.

/*
class  Test3 {
    Test3(ThisDemo td) {
        System.out.println("Test class constructor");
    }
}
class ThisDemo
{
    void m1()
    {
        Test3 t1 = new Test3(this);
    }

    public static void main(String[] arg)
    {
        ThisDemo t = new ThisDemo();
        t.m1();

    }

}
*/


// 6. this can be used to return the current class instance from the method. Example


class ThisDemo
{
    ThisDemo m1 ()
    {
        return this;
    }

    public static void main(String[] arg)
    {
        ThisDemo t = new ThisDemo();
        t.m1();

    }

}