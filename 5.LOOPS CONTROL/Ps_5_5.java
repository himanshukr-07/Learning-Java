import java.io.*;
import java.util.Scanner;

public class Ps_5_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 1 ;
        System.out.println("Enter No. for Factorial");
        int a = sc.nextInt();
        for(int i = 1 ; i <= a ; i++){
        sum *=  i;
        }
        System.out.println("Factorial = "+sum);
    }
}