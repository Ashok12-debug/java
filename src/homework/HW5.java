package homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        float Ac, Ar,At,radius, base, height, l,b;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius= scan.nextFloat();
        System.out.println("Enter the base of triangle:");
        base=scan.nextFloat();
        System.out.println("Enter the height of triangle:");
        height=scan.nextFloat();
        System.out.println("Enter the length of rectangle:");
        l=scan.nextFloat();
        System.out.println("Enter the breadth of triangle:");
        b=scan.nextFloat();
        Ac= (22*radius*radius)/7;
        Ar=(1*base*height)/2;
        At=(l*b);
        System.out.println("Area of Circle:"+Ac);
        System.out.println("Area of triangle:"+At);
        System.out.println("Area of rectangle:"+Ar);
    }
}
