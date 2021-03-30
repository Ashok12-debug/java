package homework;

import java.util.Scanner;

public class HW27 {
    public static void number27(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= input.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            sum += n%10;
            product= product *(n%10);
             n /=10;
        }
        System.out.println("The sum:" +sum);
        System.out.println("The product:"+product);

    }

    public static void main(String[] args) {
        number27();
    }
}
