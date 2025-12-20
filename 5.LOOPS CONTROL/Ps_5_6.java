import java.io.*;
import java.util.Scanner;

public class Ps_5_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 1 , i = 1;
        System.out.println("Enter No. for Factorial");
        int a = sc.nextInt();
       while(i<=a){
        sum *=  i;
        i++;
        }
        System.out.println("Factorial = "+sum);
    }
}