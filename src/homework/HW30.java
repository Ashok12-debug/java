package homework;

import java.util.Scanner;

public class HW30 {
    public static void question30() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number to calculate fibonacci to the nth term: ");
        int n = input.nextInt();
        int a=1;
        int b=1;
        System.out.println("The Fibonacci series:");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(+a + "  ");

            int sum = a + b;
            a = b;
            b = sum;
        }
}
    public static void main(String[] args) {
        question30();
    }
}
