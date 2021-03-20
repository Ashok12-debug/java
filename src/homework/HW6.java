package homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        float Pc, Pt, Pr, l, b, f,s,t, r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        r=scan.nextFloat();
        System.out.println("Enter the length of rectangle:");
        l=scan.nextFloat();
        System.out.println("Enter the breadth of rectangle:");
        b=scan.nextFloat();
        System.out.println("Enter the length of one side of triangle:");
        f=scan.nextFloat();
        System.out.println("Enter the length of second side of triangle:");
        s=scan.nextFloat();
        System.out.println("Enter the length of third side of triangle:");
        t=scan.nextFloat();
        Pc=(2*22*r)/7;
        Pt=(f+s+t);
        Pr=2*(l+b);
        System.out.println("Perimeter of circle: "+ Pc);
        System.out.println("Perimeter of triangle: "+ Pt);
        System.out.println("Perimeter of rectangle: "+ Pr);


    }
}

