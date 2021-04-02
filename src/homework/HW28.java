package homework;

import java.util.Scanner;

public class HW28 {
    public static void question28() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = input.nextInt();
        int p = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = 1;
                break;
            }
        }
        if (p == 1)
            System.out.println(+n + "is not a prime");

        else
            System.out.println(+n + "is a prime number");
        if (p != 0)
            return;
        {
            String num = "";
            int c = 0;
            for (int j = 1; j <= n; j++) {
                int nth = 0;
                for (int k = n; k >= 1; k--) {
                    if (j % k == 0) {
                        nth = nth + 1;

                    }
                }
                if (nth == 2) {
                    c = c + 1;
                    num = num + j + "";
                }

            }
            System.out.println( " The number is " + c + "th prime number.");
            System.out.println("All prime number between 2 to " + n + "are: ");
            System.out.println( num+"" );
        }
    }


    public static void main(String[] args) {
        question28();
    }

}
