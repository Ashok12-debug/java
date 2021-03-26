package homework;

import java.util.Scanner;

public class HW20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(" Enter an operator(+,-,/,*) only:");
        char operator = input.next().charAt(0);
        if (operator=='+')
        {
            System.out.println("Add to get the result "+(a+b));

        }
        else if (operator=='-')
        {
            System.out.println("Subtract to get the result "+(a-b));

        }
        else if (operator=='*')
        {
            System.out.println("Multiply to get the result "+(a*b));

        }
        else if (operator=='/')
        {
            System.out.println("divide to get the result "+(a/b));

        }
        else
        {
            System.out.println("Exit the program");
        }







    }
}
