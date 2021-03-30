package homework;


import java.util.Scanner;

public class HW26 {
     public static void number26(){
         Scanner input= new Scanner(System.in);
         System.out.println("The given number is:");
         int n= input.nextInt();
         int r=0;
         while(n!=0)
         {
             int remainder= n%10;
             r=r*10+remainder;
             n=n/10;

         }
         System.out.println("the reverse is "+r);
     }

    public static void main(String[] args) {

         number26();
    }
}
