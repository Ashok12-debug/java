package homework;

import java.util.Scanner;
public class HW36 {
    public static void question36(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = input.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the numbers in array:");
        for (int i=0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }
        System.out.println("The duplicate elements:");
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                }
            }
        }

    }

    public static void main(String[] args) {
        question36();
    }
}
