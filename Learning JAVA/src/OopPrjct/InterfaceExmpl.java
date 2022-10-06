package OopPrjct;

/*
Q: What is Interface?
Interfaces are the blueprint of the class. It specifies what a class must do and not how.

inside of an interface class all methods must be abstract.

uses of interface:

1. it is used to achieve abstraction
2. it supports multiple inheritance (multiple inheritance, not supported by java).
3. it can be achieved loose coupling.


Syntax of interface:

interface interfaceName
{
1. Methods   it will be abstract public
2. fields    it will be public, static, final (example: if we put int s=4; it will automatically put public static final before int)
3. in Java 8th version: we can create default concrete methods
                            we can create static methods. we cannot put protected or public.

4. in Java 9th version: we can create private methods.

}


 */


public class InterfaceExmpl
{


}
interface I1
{
    void show(); // we cannot use access modifier, protected, default
}
class Test implements I1
{
    public void show()
    {
        System.out.println("1");
    }

    public static void main(String []ars)
    {
        Test t = new Test(); // we cannot create an object of interface class
        t.show();
    }
}
