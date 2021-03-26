package homework;


import java.util.Scanner;

public class HW22 {
    public static void number22(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n= input.nextInt();
        for (int i=0; i<=10; i++)
        {

            System.out.println(n+ "*"+i+ "=" +i*n);
        }


    }

    public static void main(String[] args) {
        number22();
    }


}
