package homework;

import java.util.Scanner;

public class HW34 {
    public static void question34()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = input.nextInt();
        int []arr= new int[size];
        System.out.println("Enter any number:");
        for (int i=0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }
        for (int i=0; i<arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        System.out.println("Reversed array: ");
        int i = 0;
        while (i <arr.length) {
            System.out.print(arr[i]+ " ");
            i++;
        }


    }

    public static void main(String[] args) {
        question34();
    }
}
