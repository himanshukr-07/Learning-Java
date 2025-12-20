import java.io.*;
import java.util.Scanner;

public class Ps_5_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 10;
        System.out.println("Enter No. for Multiplication");
        int a = sc.nextInt();
        while( i >= 1){
        System.out.println(a+" X " + i + " = "+a*i);
        i--;
        }
    }
}