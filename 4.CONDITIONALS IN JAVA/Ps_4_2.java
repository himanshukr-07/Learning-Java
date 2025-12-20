import java.io.*;
import java.util.Scanner;

public class Ps_4_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject");
        float c = sc.nextFloat();
        if( a >= 33f && b >= 33f && c >= 33f){
            if(((a+b+c)/3)>= 40f){
                System.out.println("You are passed");
            }
            else{
                System.out.println("You are failed due to overall marks");
            }
        }
        else{
                System.out.println("You are failed due to individual");
            }
        sc.close();
    }
}
