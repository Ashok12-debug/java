package homework;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        int a, c, b, f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        a = input.nextInt();
        f = (a *9)/5 + 32;
        System.out.println("The temperature in Fahrenheit: " + f+" degree fahrenheit.");
        System.out.println("Enter the temperature in Fahrenheit: ");
        b = input.nextInt();
        c = 5*(b - 32)/9;
        System.out.println("The temperature in Celsius: " + c+ " degree celsius.");
    }
}

