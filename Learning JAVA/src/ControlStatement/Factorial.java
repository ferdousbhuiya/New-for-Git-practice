package ControlStatement;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        String yn;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println(" Please enter the number, which number's Factorial you need, but not more than 25");
            int num = s.nextInt();
            long fact = 1;
            for (int i = 1; i <= num; i++) {

                fact = fact * i;

            }
            System.out.println("Your Factorial result is :" + fact);
            System.out.println("Do you want to continue (Press 'y' for 'yes' and 'n' for no )");
            yn = s.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}