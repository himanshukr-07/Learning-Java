import java.io.*;
import java.util.Scanner;

public class Ps_6_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mat1[][] = new int[2][3];
        int mat2[][] = new int[2][3];
        System.out.println("Enter the elements of 1st Matrix");
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<3 ; j++){
            System.out.printf("Matrix[%d][%d] = " , i+1 ,j+1);
            mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd Matrix");
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<3 ; j++){
            System.out.printf("Matrix[%d][%d] = " , i+1 ,j+1);
            mat2[i][j] = sc.nextInt();
            }
        }
     int temp[][] = new int[2][3];
          for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
System.out.println("Final Matrix");
        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<3 ; j++){
            System.out.print(temp[i][j] + " " );
            }
            System.out.printf("\n");
        }

    }
}
