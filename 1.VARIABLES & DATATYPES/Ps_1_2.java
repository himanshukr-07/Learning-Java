import java.io.*;
import java.util.Scanner;

public class Ps_1_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st Subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of 2st Subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of 3st Subject");
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.println("CGPA = " +cgpa);
    }
}