package homework;

import java.util.Scanner;

public class HW10a {
    public static void main(String[] args) {
        int s, u, t, a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial velocity:");
        u= input.nextInt();
        System.out.println("Enter the time required:");
        t= input.nextInt();
        System.out.println("Enter the acceleration:");
        a= input.nextInt();
        s=(u*t)+(a*t)/2;
        System.out.println(" The displacement is : "+s);
    }
}
