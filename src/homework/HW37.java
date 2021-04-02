package homework;

import java.util.Scanner;

public class HW37 {
    public static void question37(){
        int rows, cols;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = input.nextInt();
        System.out.println("Enter the number columns");
        cols = input.nextInt();

        int [][]first = new int[rows][cols];
        int [][]second = new int[rows][cols];
        int [][]sum = new int[rows][cols];
        System.out.println("Enter the elements of matrix1");
        for (  int i= 0 ; i < rows ; i++ )
        {
            for (int j= 0 ; j < cols ;j++ )
                first [i][j] = input.nextInt();

        }
        System.out.println("Enter the elements of matrix2");

        for ( int i= 0 ; i < rows ; i++ )
        {
            for (int j= 0 ; j < cols ;j++ )
                second[i][j] = input.nextInt();
        }

        for ( int i= 0 ; i < rows ; i++ )
            for ( int j= 0 ; j < cols ;j++ )
                sum[i][j] = first[i][j] + second[i][j] ;

        System.out.println("Sum of matrices:-");

        for (int i= 0 ; i < rows ; i++ )
        {
            for ( int j= 0 ; j < cols ;j++ )
                System.out.print(sum[i][j]+" ");

            System.out.println();
        }

    }

    public static void main(String[] args) {
        question37();
    }
}




