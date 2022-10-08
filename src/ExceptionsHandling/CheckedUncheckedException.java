package ExceptionsHandling;

import java.io.FileInputStream;

public class CheckedUncheckedException {
}
/*

Difference between Checked and Unchecked Exceptions?
Always exceptions occurs in run time, never occurred in compile time.
The exceptions which compiler can check, it is called compile time exception(Checked Exceptions) and exception compiler
ignored or cannot check it is called runtime exceptions (Unchecked Exceptions).


By using Try ,catch,  finally, throw, and throws we can handle the exceptions.

Syntax:

try
{
//risky code
}
catch(ExceptionClassName ref.var.name), if we do not know what type of exception it is, we can use exception only
{
//handling code
}

 */

class TestForTry
{

    public static void main(String [] arg)
    {
        try
        {
            FileInputStream fis = new FileInputStream("d:/abc.txt") ;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}