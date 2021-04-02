package homework;

import java.util.Scanner;

public class HW33 {

    public static void question32() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array numbers:");
        for (int i=0; i<size; i++)
        {
            arr[i]=input.nextInt();
        }
        for (int i=0; i<size; i++)
        {
            for (int j=i+1; j<size; j++)
            {
                if (arr[i] > arr[j]) {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ", ");
        }


    }

    public static void main(String[] args) {
        question32();
    }
}