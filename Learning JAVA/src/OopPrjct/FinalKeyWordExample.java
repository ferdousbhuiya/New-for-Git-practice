package OopPrjct;

public class FinalKeyWordExample {
}
/*

Where we can use 'final' keyword?
variable, method that will not be overridden and class
 */
/*
class Test4
{
    // Example of use of 'final' in variable case.
    public static void main(String[] args)
    {
         int i=10;
        i += 20;
        System.out.println(i);

        //In this block, if we run the program, it will newly assign i= 30;
        // if wer use 'final' keyword before i, then in the second line it will show error,
        // we can use 'final' in case of constant values,like: pi, g, speed of light etc.

    }

}
*/

//****************


/*
'final' is used in method which cannot be overridden.
 */
/*
class Demo
{
    void mw()
    { // if we use final before the method name 'mw()' as like final void mw(), it will show compile-time error.
        System.out.println("I am in Demo");
    }
}

class Test5 extends Demo
{
    void mw()
    {
        System.out.println(" i am in Test5 class");
    }

}

*/

/*
if we wish to make a class and nobody can extend that class, at that time it will show error.

Example:
 */

class cv
{

    void bm()
    {

    }
}

class ih extends cv
    {
    // if we use final before class CV. if we use final, then it will show error in the next class.
    }