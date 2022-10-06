package ControlStatement;

import java.util.Scanner;

/*
1. Selecttion or conditional statements
    if, if-else, if-else-if, nested if.
    Switch statement
2. iteratio or looping statement
    for, while, do-while
3. Jump statement
    break, continue, return

    Syntax of Switch:

    Switch(variable to be tested)
    {
        case (level1)
        .
        .
        break;

        case (level2)
        .
        .
        break;

        default:
            .
            .
            break;

         }


Syntax for for loop:

    for (initialization; condition; increment/decrement)
    {
    body
    }

While syntax:
while (condition)
{
body
}
first it will check the codition, if the condition is true, then it will go to body, if codition is false, it will go
out from the loop.

do-while Syntax:

do
{
body
} while (condition)

difference between while-do or do-while, answer: in while, first check condition then go to the body.
on other hand, in do-while, first go to the body, then go for condition.







 */
public class ControlStmnt {

    public static void main ( String args[]){
        //Q. find out the greater number of 3 provided number
        Scanner scnr = new Scanner(System.in);
        int a=12, b=34, c=56;

        if (a>b && a>c){
            System.out.println(" a is the greater number");
        }else if (b>a && b>c){
            System.out.println(" b is the greater number");
        } else{
            System.out.println(" c is the greater number");
        }

// Q. Calculated the leap year, condition for leap year, it will divided by 4 but not divided by 100.

        System.out.println("Please enter a year, that will check ");
        int year = scnr.nextInt();
        //int year = 2016;

        if((year%400==0) ||(year%4 ==0 && year%100 !=0))
        {
            System.out.println(year + " is leapyear");
        }else{
            System.out.println(year + " is not leapyear");
        }

        System.out.println("Please enter your name.");
        String name = scnr.next();
        System.out.println("Enter your age");
        int age = scnr.nextInt();
        System.out.println("Enter your Gender");
        char gndr = scnr.next().charAt(0);
        System.out.println();
        System.out.println(year + " ***************==================**********************");
        System.out.println("Your name: "+ name);
        System.out.println("Your age: "+ age);
        System.out.println("Your Gender is: "+ gndr);
    }

}
