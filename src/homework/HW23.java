package homework;

import java.util.Scanner;

public class HW23 {
    public static void number23(){
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= input.nextInt();
        for (int i=0; i<=n; i++)
        {

             sum += i;
        }
        System.out.println("The sum is:"+sum);

    }

    public static void main(String[] args) {
        number23();
    }
}
