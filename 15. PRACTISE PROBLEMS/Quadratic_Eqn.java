// finds the roots of quadratic equation

import java.io.*;
import java.util.Scanner;

public class Quadratic_Eqn{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter coefficient A,B,C");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double D = (b*b)-(4*a*c);
     if(D>0){
        double r1 = (-b + Math.sqrt(D))/(2*a);
        double r2 = (-b - Math.sqrt(D))/(2*a);
        System.out.println("Roots Are " + r1 + r2);
     }else if(D== 0){
        double r = -b /(2*a);
        System.out.println("Root are = " +r);
     }else{
        double rear = -b/(2*a);
        double img = Math.sqrt(-D)/(2*a);
        System.out.println("Root are = " + rear + img );
     }
        
     }

}