import java.io.*;
import java.util.Scanner;

public class Ps_5_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1, m = 0 , n = 0;
        System.out.println("Enter No. for Multiplication");
        int a = sc.nextInt();
        while( i <= 10){
        m =  a*i;
        System.out.println(a+" X " + i + " = "+m);
        i++;
        n += m ;
        }
        System.out.println(" Sum = " +n);
    }
}