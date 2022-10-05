package ControlStatement;

import java.util.Scanner;

public class RecursionExample {
    String yn;

    static long fact = 1;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Please enter the number, which number's Factorial you need, but not more than 25");
        int num;
        num = s.nextInt();
        RecursionExample re = new RecursionExample();
        re.calFact(num);
        System.out.println("Your Factorial result is:" + fact);
    }
    void calFact(int num){
        if (num>1){
            fact = fact*num;
            calFact(num-1);
        }


    }

}