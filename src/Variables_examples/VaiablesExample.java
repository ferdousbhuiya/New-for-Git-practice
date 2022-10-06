package Variables_examples;

class VaiablesExample {
    int a=10;
    static int b= 20;


    public static void main(String[] arg){

        VaiablesExample obj = new VaiablesExample();

        System.out.println(obj.a); //output will be 10
        System.out.println(obj.b); // output will be 20

        obj.a =1000;
        obj.b = 2000;

        System.out.println(obj.a); //output will be 1000
        System.out.println(obj.b); // output will be 2000

        VaiablesExample obj1 = new VaiablesExample();

        System.out.println(obj1.a); //output will be 10
        System.out.println(obj1.b); // output will be 2000

        /*
        What is the reason for the new value of 'a', it is not changed for the new object but Static variables
        holds its value. Every new object instance variable through its original declared value. This is the difference between
        instance variable and Static variables.
         */

    }
}
