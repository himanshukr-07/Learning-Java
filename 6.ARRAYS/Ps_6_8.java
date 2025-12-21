import java.io.*;
import java.util.Scanner;

public class Ps_6_8{
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

    void sorted(){
        boolean isSorted = true ;
       for(int i = 0 ; i < n-1 ; i++){
           if( arr[i]> arr[i+1]){
            isSorted = false ;
            break ;
           }
       }
       if(isSorted){
        System.out.println("\nThe Array is Sorted ");
       }else{
        System.out.println("\nThe Array is Not Sorted ");
       }
    }

     public static void main(String[] args){
         Ps_6_8 p = new  Ps_6_8();
         p.TakeVal();
         p.display();
         p.sorted();
         
    }
}