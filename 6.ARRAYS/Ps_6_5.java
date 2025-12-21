import java.io.*;
import java.util.Scanner;

public class Ps_6_5{
    
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
    
    void reverse(){
        int temp;
      for(int i = 0 ; i < n/2 ; i++ ){
          temp = arr[i];
          arr[i] = arr[n-1-i];
          arr[n-1-i]= temp;
      }
      System.out.print("\nReversed Array\n");
      display();
    }


    public static void main(String[] args){
         Ps_6_5 p = new  Ps_6_5();
         p.TakeVal();
         p.display();
         p.reverse();
    }
}