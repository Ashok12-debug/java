package homework;

import java.util.Scanner;

public class HW31 {
    public static void question31(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to nth term:");
        int n= input.nextInt();
        int sum=0;
        for (int i=1; i<n; i++){
            sum =sum*10+i;
            System.out.println(" "+sum);

        }


    }

    public static void main(String[] args) {
        question31();
    }
}
