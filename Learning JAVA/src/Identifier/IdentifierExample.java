package Identifier;
/*
Identifier is any name, ti can be variable name, method name, class name or interface name.
Example"

int a = 10;
here int is data type, a is variable = is operator and 10 is literal.
a is variable and identifier also.

Rules for identifiers:
1. Spaces cannot be used.
2. only _ and $ can be used.
3. Reserved words cannot be used.
4. Integer value cannot be used in the first position, it can be used after the first characters.


Naming convention:

for variables: Two words can be used with '_' or $ other symbols cannot be used. It should be in lower case letter.

for method: we have to use camel case system. Example: my(), myInt(), or myIntDg() etc.

for class/interface: always start with capital letter, Example: My, MyInterest, MyInterestName etc.
 */
public class IdentifierExample {

/*
meaning of this structure:

'class' is identifier that is a keyword. After then,
under a single class we can make as many class as we can. But only one public class we can create.
follow the naming convention.

'IdentifierExample' is the class name.


Another explanation of the main method

public static void main (String [] args)


here 'public' is an access modifier, there are 4 types of access modifiers available in JAVA.
4 access modifiers are: public, private, protected and default.

Why the main method is public?
Answer: there is one reason that if we install JAVA in D drive and the JDK is available in C drive
without public it will not able to access the JDK without public access modifier.

What is the reason of Static keyword using?
Answer: Static is a keyword also, main is the name of method, JVM can call this method without making any object due to this
'static' keyword.

What is void?
Void is return type keyword. Void means, empty, not zero or null. So, the main method will not return anything. JDK always
start execution from main method.

What is String?
String is a class. Why we use String type class, we could use int or other type of class. We are using the String because
String cannot change and all processing in inside of JAVA always used String type.

[] is array and arg is the array name.

System.out.println();

Q: What is System in the above command?
Answer: System is a package which is available in Java.lang

out: out is a static variable of print-stream, inside the System class and out for output.

println is method, print Stream method. There are three types of print stream method, a) is print, b) is println and
c) is printf method. 'print' method, prints in the same line, 'println' uses next line after printing and 'printf' is used


If we change anything in these two lines, JVM will show compile time error. The program will not run.

In main method we can make some changes like:


a). instead of 'public static', we can write 'static public'
b). we can declare any acceptable form like
            (String[] args)
            (String []args)
            (String args[])
c). we can give any identifier instead of 'args' .
d). We can use var args instead of String[], like this 'String.. args'
e). With 'main' we can use, final, synchronized, strictfp with main.


in below the example is available.


 */

    static public void main(String... abcd){
        System.out.println("How are you?");
    }
}
