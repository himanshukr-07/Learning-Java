import java.io.*;
import java.util.Scanner;

public class Ps_5_11{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. upto for Sum");
        int a = sc.nextInt();
        for(int i = 0 ; i <= a ; i++){
         if(i % 2 == 0){
         sum += i;
          }
        }
         System.out.println("Sum of even no. upto "+a+ " is " +sum );
    }
}
