package homework;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        float p,k;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        p=scan.nextFloat();

        k= (float) (p/2.205);
        System.out.println("New weight is: "+k+ "kg");
    }
}
