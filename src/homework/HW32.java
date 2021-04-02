package homework;

import java.util.Scanner;

public class HW32 {
    public static void question32(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any  numbers:");
        int [] array= new int[5];
        for (int i =0; i< array.length; i++){
            array[i]= input.nextInt();
        }
        int sum =0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of array is:"+sum);

    }

    public static void main(String[] args) {
        question32();
    }
}
