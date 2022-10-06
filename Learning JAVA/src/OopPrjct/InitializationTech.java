package OopPrjct;

public class InitializationTech {

    String color;
    int age;

    public static void main(String [ ] args){

        InitializationTech buzo = new InitializationTech();

        buzo.color="Black"; // this is the technique of initialization, it is called by reference of instance variable.
        buzo.age = 6;

        System.out.println(buzo.color+ " "+buzo.age);


    }


    class Animal{
/*
Using method, we can initialize the object.
This second class is only for the training purpose
this will show that we can initialize by method also.

 */
        String color;
        int age;

        void initObj (String c, int a)
        {
            color=c;
            age =a;
        }
        Animal buzo1 = new Animal();
       // buzo1.initObj("Red", 5);
       // buzo1.display();

        void display()
        {
            System.out.println(color+" "+age);
        }
    }
}
