package homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int a, b, sum;
        float average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a= scan.nextInt();
        System.out.println("Enter the second number:");
        b=scan.nextInt();
        sum= a+b;
        average= ((a+b)/2);
        System.out.println("Sum is " + sum );
        System.out.println("Average is "+ average);


    }
}
