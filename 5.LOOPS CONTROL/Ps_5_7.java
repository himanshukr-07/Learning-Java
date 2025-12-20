import java.io.*;
import java.util.Scanner;

public class Ps_5_7{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int i = 0 ;
      System.out.println("Enter value for number of ROWS");
      int a = sc. nextInt();
   
  // this loop runs from 0 to 2
        //  if i=0 ----> print 1 star
        //  if i=1 ----> print 3 star
        //  if i=2 ----> print 5 star
        //  no_of_stars=(2*i+1) for upper triangle
        while(i<a){
            int j=0;
        while(j<a-i){
            System.out.print("* ");
            j++;
          }
        System.out.print("\n");
        i++;
      }
  sc.close();
    }
}