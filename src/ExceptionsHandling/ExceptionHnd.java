package ExceptionsHandling;

public class ExceptionHnd {

    public static void main(String[] args)
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println(100/0); // In this line there is an exception. Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at ExceptionsHandling.ExceptionHnd.main(ExceptionHnd.java:9) this will be in output.
        System.out.println("4");
        System.out.println("5");


    }
}
/*

Exception: It is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that
disrupts the normal flow of the program.

Exception handling is the alternative way to run the program normal flow.Not fix the error.



Q: which is parent class of all classes in Java. Object is the parent class of java.

Q: What is the difference between exception and error?
Ans. Exceptions occurred by program and errors are occurred because of lack of System Resources; not by our programs and thus
programmer cannot do anything.




Exception hierarchy:                                                   |-->  Compile-Time Exception(Checked Exception)
                        |--> Exception(1. program, 2. recoverable)--> |--> Runtime Exception(Unchecked Exception)
Object --> Throwable--> |
                        |--> Errors(1. Lack of system resources, 2. not recoverable),it is only Runtime exception (unchecked)


Exception:
1. ClassNotFound Exception
2. NoSuchMethod Exception
3. IOExceptions (EOFExceptions, FileNotFoundExceptions, InterruptedIOException)
4. Sequel Exception
5. RunTime Exception (Arithmetic Exception, ClassNotFound, ...)
6. Interrupted Exception



Error:


There are thousands of exceptions and errors available.
 */