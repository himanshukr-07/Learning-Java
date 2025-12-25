// implementing all tyypes of exceptions

import java.util.Scanner;
import java.io.*;


public class Ps_14_2{
    public static void main(String[] args){
     try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter two no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);
     }catch (ArithmeticException e){
        System.out.println("Error : Cannot divide by zero");
     }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error : Array index limit exceeded");
     }catch(NegativeArraySizeException e ){
        System.out.println("Error : Size cannot be negative");
     }finally {
        System.out.println("Always Executes");
     }
    }
}