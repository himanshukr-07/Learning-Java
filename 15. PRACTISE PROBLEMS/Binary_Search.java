import java.util.Scanner;
import java.io.*;

public class Binary_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        System.out.println("Enter Element to search");
        int key = sc.nextInt();
        int low = 0, high = arr.length-1, mid, pos = -1;

        while(low<= high){
            mid = (low+high)/2;
            if(arr[mid] == key){
                pos = mid;
                break;
            }else if(arr[mid] < key){
                low = mid + 1;
               
            }else{
                high = mid -1;    
            }
        }
            if(pos == -1 ){
                System.out.println("NOT FOUND");

            }else{
                System.out.println(key+ " found at index "+ pos);
            }
        
    }
}