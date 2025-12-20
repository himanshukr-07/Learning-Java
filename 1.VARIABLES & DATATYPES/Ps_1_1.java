//package com.comapny;
import java.io.*;
import java.util.Scanner;

public class Ps_1_1{
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("Enter number 3");
        int c = sc.nextInt();
        int sum = a + b + c ;
        System.out.println("Sum is " + sum);
    }
}
