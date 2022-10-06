package OopPrjct;
/*

Q. What is Opps?
Oops means, Object Oriented Programming System / Structure
This is a programming paradigm / methodology
    There are lots of methods for this paradigm
        a. Object Oriented paradigm
        b. Procedural paradigm
        c. functional paradigm
        d. logical paradigm
        e. structural paradigm

Q. What are the languages follow the Oops?
Ans.
a). Smalltalk: this is the first Oops program which followed 100% Oops. Truly Object Oriented Programming
b). Java c). C# d). C++ e). Python
 a. Object-Oriented paradigm:

Q. How many pillars of Oops?
There are six main pillars of Oops
    1. Class
    2. Object & Methods
    3. Inheritance
    4. Polymorphism
    5. Abstraction
    6. Encapsulation


1. Class: Collection of Objects (example vehicle, animal, Birds)
           Class is not a real world entity. It is just a blueprint or prototype of template
           class does not occupy memory

           Syntax of Class:
           access modifier class ClassName
           {
           inside the body it will contain:
                  Methods
                  Constructor
                  fields
                  blocks
                 nested class
           }
2. Method: A set of code which performs a particular task (Examples: run, eat, fly etc.)
    Advantage of methods
            code reputability
            code optimization
    Syntax: access-modifiers return types method name (list of parameters)
    {


    }
3. Object: Object is an instance of class.  O
            Object is real world entity
            Object occupies memory.
     Object consists of
        1. identity-- name -- unique
        2. State / Attribute (Example: color, age, breed of dog)
        3. Behaviour (Example: eat, runs) it represents methods
     How to create object?
        by using new keyword
        by using newInstance Method()
        by using clone() method
        by using deserialization method
        by using factory method

    creation of object:
        1). Declaration --> Animal buzo
        2). Instantiation --> buzo = new Animal(); Here,  Animal() is a constructor, and initialized. i.e. 2 & 3 combined.
        3). initialization

     Example of Syntax combined:
            Animal buzo = new Animal();

            we can call method through this object, example: buzo.run(); or buzo.eat();

 */
public class OopMthd
{
    public void eat()
    {
        System.out.println("I am eating"); // it will not run without object.
    }
    public static void main(String [] args)
    {
        System.out.println("1");
        OopMthd obj = new OopMthd(); // to run the method named 'eat', we have to make an object.
        obj.eat();
        obj.run();
// No matter what method is in outside before or after main method, it depends on the sequence  of calling.
        OopMthd aa = new OopMthd();
        aa.eat();
        aa.run();
        int b= aa.addition(78,67);
        System.out.println(b);
        Birds spa = new Birds();
        spa.fly();

    }
    public void run()
    {
    System.out.println("I am running");
    }
    int addition(int alj, int k)
    {
        return alj+k;
    }

    static class Birds
    {
        void fly()
        {
            System.out.println(" I am flying");
        }
    }
}
