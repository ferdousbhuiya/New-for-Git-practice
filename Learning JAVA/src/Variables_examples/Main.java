package Variables_examples;
public class Main {
    int a = 45; //This is instance variable
    static int b = 41; // Static variable
     int sum;
    int addition(int a,int b, int c ){
        c=14; // local variables, because this cannot be used outside this method.
        sum = a+b+c;
        System.out.println("The summation is: "+sum);
        return  sum ; // As the variable 'sum' is instance variable so, we can use it in the entire class.
    }
    int division(){
        int f=100, mult;
        mult = sum-b*f/100+a;
    System.out.println("The result is: "+mult);
        return mult;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
/*
Local variables:

1). Declaration: inside the Methods, constructor or blocks.
2). Scope: inside the Methods, constructor or blocks not outside.
3). When variables Gets Allocated: When method, constructor or block
                                gets executed, variables allocated memory. When gets exits, variables destroyed.

4). Stored Memory: Stack Memory.
5). Default values: There is no default values, it must be initialized. Value should be provided before used.
6). Access pacifier: Access pacifiers cannot be used with local variables.


Instance variables:

1). Declaration: inside the class but outside Methods, constructor or blocks.
2). Scope: Within a class, Inside all Methods, constructor or blocks not inside the Static method.
3). When variables Gets Allocated: When object is created, variables allocated. When object destroyed variable releases memory.
4). Stored Memory: Heap Memory.
5). Default values: There default values available, for int, 0; for boolean, false; for object, null;
6). Access pacifier: Access pacifiers can be used.
7). How to use: For simple method, we can call directly.
                For Static method, we can call through object. Example:
                A ob = new A;
                ob.a; where 'A' is class name and 'a' is instance variable.



Static variables:

1). Declaration: With 'static' keyword, inside the class but outside Methods, constructor or blocks.
2). Scope: Similar to Instance variable i.e. Inside all Methods, constructor or blocks including Static methods, constructor or blocks.
3). When variables Gets Allocated: When we run the program and .class (dot class) file is loaded, variable allocated
                                    When .class file unloaded, variable gets deleted/ destroyed.
4). Stored Memory: Non-Heap Memory / Static Memory.
5). Default values: Similar to instance variables. There default values available, for int, 0; for boolean, false; for object, null;
6). Access pacifier: Access pacifiers can be used.
7). How to use: a. For simple method, we can call directly.
                b.  by using class name Example: A.a
                c. by using object reference name, Example: A obj = new A;
                obj.a; where 'A' is class name and 'a' is instance variable.


 */