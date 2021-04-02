package homework;

import java.util.Scanner;

public class HW29 {
    public static void question29(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find nth series sum: ");
        int n= input.nextInt();
        double sum =0;

        for (int i=1; i<=n; i++){
            sum += ((double) i/findFactorial(i));
        }
        System.out.println("Sum of nth series: "+sum);
    }
        public static int findFactorial(int n){
            int f=1;
            for (int i=1; i<=n; i++){
                f= f*i;
            }
            return f;
        }


    public static void main(String[] args) {
        question29();
    }
}
