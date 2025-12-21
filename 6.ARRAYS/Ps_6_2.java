import java.io.*;
import java.util.Scanner;

class Ps_6_2{

int element(){
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int arr[] = new int[n];
   System.out.println("Enter Array elements");
   for(int i = 0 ; i < n ; i++){
    arr[i] = sc.nextInt();
   }
   System.out.println("Your Entered Array is :");
   for(int e : arr){
    System.out.print(e + " ");
   }
   System.out.println("\nEnter elements for Search");
   int k = sc.nextInt();

   for(int i = 0 ; i < n ; i++){
     if(arr[i] == k){
      System.out.println("Element found at position " + (i+1));
     }else if(arr[i] != k){
        System.out.println("Element is not present");
     }
   }

   return 0;

   }

   public static void main(String[] args){
    Ps_6_2 p = new Ps_6_2();
    p.element();
   
}
}