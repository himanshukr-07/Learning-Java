import java.io.*;
import java.util.Scanner;

public class Ps_5_2{
    public static void main(String[] args){
        int sum = 0 , i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. upto for Sum");
        int a = sc.nextInt();
        while(i<=a){
        if(i % 2 == 0){
         sum += i;
          }
         i++;
        }
         System.out.println("Sum of even no. upto "+a+ " is " +sum );
    }
}
