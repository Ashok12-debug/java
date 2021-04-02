package homework;

import java.util.Scanner;

public class HW35 {
    public static void question35(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size:");
        int size= input.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the number:");
        for (int i=0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }
        int lrg=arr[0];
        int sLrg=arr[0];
        int i = 0;
        while (i < arr.length) {

            if (arr[i] > lrg) {
                sLrg = lrg;
                lrg = arr[i];

            } else if (arr[i] > sLrg) {
                sLrg = arr[i];

            }
            i++;
        }

        System.out.println("Second largest number is:" + sLrg);

        }









    public static void main(String[] args) {
        question35();
    }
}
