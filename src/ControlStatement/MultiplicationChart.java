package ControlStatement;

import java.util.Scanner;

public class MultiplicationChart {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println(" Please enter the number, which multiplication table you need");
        int num = s.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = " +i*num);
        }
    }
}
