package OopPrjct;

public class SuperKeyWordExmpl
{
}
/*
Super keyWord, it is also the keyword for reference variable which is used to refer immediate parent class object.

1). 'super' keyword can be used to refer immediate parent class instance variable.

*/


// The fist uses of super keyword example.


/*
class A1
{
    int a=10;
}
class B1 extends A1
{
    int a = 20;
    void show (int a)
    {
        System.out.println(a); // output = 34, this is form the method show (int a), we made object of B and initialized by a=34,
        System.out.println(this.a);// output = 20, this is from its current class, a is its instance variable.
        System.out.println(super.a); // output = 10, this is from the parent class instance variable.

    }
    public static void main(String [] args)
    {
        B1 obj = new B1();
        obj.show(34);
    }
}

*/

/*
Uses of 'super' keyword:

1). 'super' keyword can be used to refer immediate parent class instance variable.
2). 'super' keyword can be used to invoke immediate parent class method.
3). super() can be used to invoke immediate parent class constructor.
 */



// 2). 'super' keyword can be used to invoke immediate parent class method. Example:


/*

class Ab
{
    void ma ()
    {
        System.out.println("I am in Class Ab");
    }

}
class Ba extends Ab
{

    void ma()
    {
        System.out.println("I am in Class Ba ");
    }
    void show()
    {
        ma(); // if we call directly then it will call own class method, its output will be (I am in Class Ba).
        super.ma();// if we call through 'super', then it will call parent class method, the output will be (I am in Class Ab).
    }

    public static void main(String [] args)
    {
        Ba obj = new Ba();
        obj.show();
    }
}

*/

// 3). super() can be used to invoke immediate parent class constructor. Example:



class Ab
{
     Ab ()
    {
        System.out.println("I am in Class Ab");
    }

}
class Ba extends Ab
{
    Ba()
    {
        //here compiler use another 'super () ' constructor
        // when we call only 'super()' it calls both constractors Ab and Ba.
       // super();
        System.out.println("I am in Class Ba ");
    }
    public static void main(String [] args)
    {
        Ba obj = new Ba();

    }
}

