package OopPrjct;

public class A_Inherit
{
    void showA()
    {
        System.out.println("A Class method");
    }

}
class B extends A_Inherit
{
    void showB()
    {
        System.out.println("B class method");

    }
}
class C extends B
{
    void showC()
    {
        System.out.println("C class method");
    }
    public static void main(String [] args) {
        A_Inherit ob1 = new A_Inherit();
        ob1.showA(); // Here only we can call from class A_Inherit
        //ob1.showB(); // if we call showB() in this same class it will not work
        //ob1.showC()
        B ob2 = new B();
        ob2.showA(); // here we can call both method from first class and second class
        ob2.showB(); // this is the example of single inheritance.

        C ob3 = new C() ;
        {
            ob3.showA();
            ob3.showB();
            ob3.showC(); // So, here we can see that in this level we can call first, second and third level
        } // it is called multilevel inheritance.


    }
}