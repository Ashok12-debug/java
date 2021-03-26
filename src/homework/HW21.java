package homework;

import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number from 1 to 7:");
        int n= input.nextInt();
        if (n==1)
        {
            System.out.println("It is Sunday.");
        }
        else if (n==2)
        {
            System.out.println("It is Monday.");
        }
        else if (n==3)
        {
            System.out.println("It is Tuesday.");
        }
        else if (n==4)
        {
            System.out.println("It is Wednesday.");
        }
        else if (n==5)
        {
            System.out.println("It is Thursday.");
        }
        else if (n==6)
        {
            System.out.println("It is Friday.");
        }
        else if (n==7)
        {
            System.out.println("It is Saturday.");
        }
        else
        {
            System.out.println("Try again from 1 to 7.");
        }
    }
}
