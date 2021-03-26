package homework;


import java.util.Scanner;

public class HW18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if (a>=b && a>=c)
        {
            System.out.println(+a+ " is the largest.");

        }
        else if( b>=a && b>=c)
        {
            System.out.println(+b+ " is the largest");
        }
        else
        {
            System.out.println(+c+" is the largest.");
        }


    }
}
