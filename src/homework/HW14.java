package homework;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number");
        int f= input.nextInt();
        System.out.println("Enter a second number:");
        int s= input.nextInt();
        if (f==s) {
            System.out.println(+f+ " is equal to "+s );
        }
        else if (f<s) {
                System.out.println(+f+ " is less than "+s);
            }

        else {
            System.out.println(+f+ " is greater than "+s);
        }




    }
}
