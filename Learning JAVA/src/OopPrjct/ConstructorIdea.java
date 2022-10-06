package OopPrjct;


/*

1. Constructor is block (similar to method) having same as that of Class name.
2. Constructor does not having return type, not even void.
3. The only access modifier can use, public, protected, default and private
4. constructor it executes automatically.


Why we use constructor?
Constructor are used to initialize an object.
We had to write more lines in programming.

How many types of constructor?
1. Default constructor
2. No argument constructor
3. Parameterized constructor.


1. Default constructor: It is also called no-argument constructor, but this constructor in not compile in JVM,
    if there is no constructor in the program, the program itself make one constructor, that is hidden, this hidden
    Constructor is called default constructor. This constructor is always no-argument constructor. Whenever user make
    one constructor, then the program will not create any constructor.

2. No-argument constructor: This type of constructor made by the programmer, in this constructor no argument is used.
3. Parameterized constructor: This type of constructor made by the programmer, in this constructor parameter is passed.

Q. What is the main function of constructor?
Ans. its main function is to initialize the object. It is only initialized the object that's why there is no return.
    That's why no need to used void.
 */
public class ConstructorIdea {
// this is the example of by default constructor , which is made my the machine itself.
    int i;
    String s;
    public static void main(String [] args)
    {
        ConstructorIdea cnst = new ConstructorIdea(); // note that here ConstructorIdea() is a default constructor, made by the machine itself.
        System.out.println(cnst.i +" " + cnst.s); // it will show the default value of String and int. Here cnst.i and cnst.s are the reference variables.

    }
    class Test
    {
        Test() // this is the no argument constructor, made by the programmer, not by the compiler.
        {
            System.out.println(" This is no argument constructor");
        }
        Test t =  new Test(); // Whenever we make an object, the constructor is initialized automatically.

    }

    class Test1
    {
        Test1( int i) // this is the example of parameterized constructor, here int i, parameter is passed.
        {
            System.out.println(" This is called parameterized constructor");
        }
    }
}
