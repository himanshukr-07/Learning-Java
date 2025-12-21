import java.io.*;
import java.util.Scanner;

public class Ps_6_6{
  int n;
    int[] arr;

    void TakeVal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        arr = new int [n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
    }
    void display(){
        System.out.println("Your Array");  
        for( int e : arr){
         System.out.print(e + " ");
       }
    }

    void largest(){
        int max = Integer.MIN_VALUE;
        for(int e : arr){
            if(e>max){
                max = e;
            }
        }
      System.out.println("\nLargest Element = "+ max);
    }

     public static void main(String[] args){
         Ps_6_6 p = new  Ps_6_6();
         p.TakeVal();
         p.display();
         p.largest();
         
    }
}