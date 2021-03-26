package homework;

import java.util.Scanner;

public class HW16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n= input.nextInt();

        if (n % 2 == 0)
        {
            System.out.println("the number " + n + " is even");
        }

        else
            {
                System.out.println(" the number "  +n+  " is odd.");
            }




    }
}
