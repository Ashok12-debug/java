package homework;

import java.util.Scanner;

public class HW10c {
    public static void main(String[] args) {
        double x,a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a= input.nextDouble();
        System.out.println("Enter the value of b:");
        b= input.nextDouble();
        System.out.println("Enter the value of c:");
        c= input.nextDouble();
        x=(-b+Math.sqrt(b*b-(4*a*c)))/2*a;
        System.out.println("The value of x: " +x);



    }
}
