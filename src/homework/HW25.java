package homework;

import java.util.Scanner;

public class HW25 {
    public static void number25(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= input.nextInt();
        int max=0;
        String sName= "";
        for (int i=1; i<=n; i++)
        {
            System.out.println("Enter a score:");
            int score= input.nextInt();
            System.out.println("Enter a name:");
            String name= input.next();
            if (score>max){
                max=score;
                sName=name;
            }
        }
        System.out.println("Student name is " +sName);
        System.out.println("Max score is "+max);


    }

    public static void main(String[] args) {
        number25();

    }

}
