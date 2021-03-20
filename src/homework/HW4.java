package homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        float P,T,R, SI;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Principal:");
        P=scan.nextFloat();
        System.out.println("Enter the Time:");
        T=scan.nextFloat();
        System.out.println("Enter the Rate:");
        R=scan.nextFloat();
        SI=(P*T*R)/100;
        System.out.println("Simple interest:"+SI);
    }
}
