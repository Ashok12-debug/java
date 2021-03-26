package homework;


import java.util.Scanner;

public class HW24 {
    public static void number24(){
        int n, f=1;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        n= input.nextInt();
        for (int i=1; i<=n; i++)
        {
            f=f*i;

        }
        System.out.println("The factorial of the number is: " +f);
    }

    public static void main(String[] args) {
        number24();
    }
}
