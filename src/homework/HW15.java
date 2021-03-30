package homework;

import java.util.Scanner;

public class HW15 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n= input.nextInt();
            if (n >= 0 && n <= 128){
                char c = (char) n;

                System.out.println("The ASCII number of " +n+ " is " +c);


            }
        }
    }

 
