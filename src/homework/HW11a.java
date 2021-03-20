package homework;

import java.util.Scanner;

public class HW11a {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner input= new Scanner(System.in);
        System.out.print(" Enter the First value (a): ");
        a = input.nextInt();
        System.out.print("  Enter the Second value (b) : ");
        b = input.nextInt();
        System.out.println("The number before swapping:");
        System.out.println("The value of a:"+a);
        System.out.println("The value of b:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The number after swapping:");
        System.out.println("The value of a:"+a);
        System.out.println("The value of b:"+b);






    }

}
