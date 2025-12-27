import java.util.Scanner;
import java.io.*;

public class Bubble_Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,210,300,10,5};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0  ; j < arr.length -i-1; j++){
                if(arr[j]> arr[j+1]){
                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]= temp;
                }
            }
        }
    System.out.println("Sorted Array");
    for(int i: arr){
        System.out.println(i);
    }
    }
}