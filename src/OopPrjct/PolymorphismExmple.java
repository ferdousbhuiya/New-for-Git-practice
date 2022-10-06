package OopPrjct;
/*
What is polymorphism?

polymorphism is the many forms.
Example: water in many forms, steam, ice and liquid water
            Sound is forms of dog sound, cat sound, musical sound etc.

      Polymorphism is two types:
      1. Compile type polymorphism, it is called Static polymorphism. We can achieve compile type polymorphism by
            method overloading. It is handled by compiler.
      2. Run time polymorphism, it is called dynamic polymorphism. It is achieved by overriding method. It is handled by JVM.

Method overloading: have to satisfy all conditions
1. Same name
2. same class
3. Different argument
    we can make different by :
        a. no. of argument
        b. sequence of argument
        c. Type of argument

Method overriding: have to satisfy all conditions
1. Same name
2. Different class
3. Same argument
    we can make same argument by:
        a. same no. of argument
        b. same sequence of argument
        c. Type of argument
4. Inheritance (IS-A) relationship must be in both methods.

 */
//This is the example of method loading:
public class PolymorphismExmple
{
    void show(int a)
    {
       System.out.println("1") ;
    }
    void show() // Here 2 methods are same name, in same class but the argument is different.
    {
        System.out.println("2");
    }
    public static void main(String [] agrs)
    {
        PolymorphismExmple ob1 = new PolymorphismExmple();
        ob1.show();
    }
}
