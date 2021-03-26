package homework;

import java.util.Scanner;

public class HW19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle: ");
        int a = input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if ((a+b)>c)
        {
            System.out.println("Triangle is formed.");

        }
        else if ((b+c)>a)
        {
            System.out.println("Triangle is formed.");

        }
        else if ((a+c)>b)
        {
            System.out.println("Triangle is formed.");

        }
        else
        {
            System.out.println("Triangle is not formed.");
        }
        if ((a==b)&&(c==a))
        {
            System.out.println("Equilateral triangle.");

        }
        else if ((a==b)||(b==c)||(c==a)) {
            System.out.println("Isosceles triangle ");

        }
        else
        {
            System.out.println("Scalene triangle");
        }

    }
}
