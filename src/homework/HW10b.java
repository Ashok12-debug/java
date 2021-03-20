package homework;

import java.util.Scanner;

public class HW10b {
    public static void main(String[] args) {
        double area, s,a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of first side:");
        a= input.nextDouble();
        System.out.println("Enter the length of second side:");
        b= input.nextDouble();
        System.out.println("Enter the length of third side:");
        c= input.nextDouble();
        s= (a+b+c)/2;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area is " +area);
    }
}
