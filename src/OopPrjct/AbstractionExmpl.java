package OopPrjct;
/*
Q: Difference between Abstraction and Encapsulation:

Ans:
Abstraction:
1). Abstraction is detail hiding(Implementation hiding)
2). Data Abstraction deals with exposing the interface to the user and hiding the details of implementation.

Encapsulation:
1). Encapsulation is data hiding (information hiding)
2). Encapsulation groups together data and methods that act upon the data.


We can achieve abstract by :
    a). By using Abstract class (0-100%)
    b). By using interfaces (100%)

To hide data we have to make abstract Class and Abstract Method inside that class.

Note: If we make one abstract Method, the class must be abstract class, but inside of an Abstract Class it is not necessary to
have an abstract method.
Abstract method is that whose method; which has no body. If both method and class are abstract then we can consider that
we achieved 100% hiding.

If a regular class extends an abstract class, then the class must have to implement all the abstract methods of abstract parent class,
or it has to be declared abstract as well.

Abstract methods in an abstract class are meant to be override in derived concrete classes otherwise compile-time will be thrown.

Abstract classes cannot be instantiated, means we cannot create an object of Abstract Class.
*/
public class AbstractionExmpl
{

}
abstract class vehicle
{
    abstract void start();
}

class Car extends vehicle
{
    void start()
    {
        System.out.println("Car starts with key");
    }
}

class Scooter extends vehicle
{

    void start()
    {
        System.out.println("Scooter starts with kick");
    }
    public static void main(String [] args)
    {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
    }
}