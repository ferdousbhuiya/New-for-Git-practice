package ControlStatement;

import java.util.Scanner;

public class Calculator {

    public static void main(String [] args){

        String yn;
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First no.");
            int no1 = s.nextInt();
            System.out.println("Enter Second no.");
            int no2 = s.nextInt();
            System.out.println("Please Select the symbol (+, -, /, *)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("The addition of 2 numbers is : " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("The subtraction of 2 numbers is : " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("The multiplication of 2 numbers is : " + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("The division of 2 numbers is : " + res);
                    break;
                default:
                    System.out.println("Invalid Symbol");
                    break;
            }
                System.out.println("Do you want to continue (Press 'y' for 'yes' and 'n' for no )");
                yn = s.next();

            }while (yn.equals("y")|| yn.equals("Y"));
        }
    }

