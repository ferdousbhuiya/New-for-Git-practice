package OopPrjct;
/*Q: What is Inheritance?
Ans. It is inheriting the properties of parent class into child class
Or
inheritance is the procedure by which one object acquires all the properties and behaviors of a parent object.
By this method we can call one method from other class by using extends.

Child class, parent class.

It is a IS-A relationship.

Main advantage of inheritance is
1. code usability.
2. Achieve polymorphism using inheritance. i.e. method overriding.

Main disadvantage of inheritance is that classes are tightly coupled, so, if we change in any class,
that will affect all other classes.


Types of inheritance:
1. Single inheritance --> one class's properties inheritance to other one class
2. Multi level --> one class's properties inheritance to other one class, that properties inheritance to other classes also.
3. Hierarchical inheritance. --> one class's properties inheritance to other two class's at a time.
4. Multiple inheritance --> 2 or more class's properties come in to one class.
5. Hybrid inheritance. --> one class to multi class and multi class to one class.


In java uses only 3 Inheritance, single, multi level and Hierarchical.

In-general we can see properties of class A transfer to in class B.
All the properties not transferred. Constructor cannot transfer and the method which one is private.

*/
public class InheritanceExmpl
{
    void eat()
    {
        System.out.println("I am eating");
    }
}
class Dog extends InheritanceExmpl
{

    public static void main(String [] args)
    {
        Dog d = new Dog();
        d.eat();
    }
}