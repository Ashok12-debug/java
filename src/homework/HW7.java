package homework;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        float r, l, v;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder:");
        r= scan.nextFloat();
        System.out.println("Enter the length of cylinder:");
        l= scan.nextFloat();
        v=(22*r*r*l)/7;
        System.out.println("Volume of cylinder: "+v);
    }
}
