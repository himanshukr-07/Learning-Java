import java.io.*;
import java.util.Scanner;

public class Ps_4_3{
    public static void main(String[] args){
        float tax =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        float Income = sc.nextFloat();
       if(  Income > 0 && Income <= 250000 ){
         tax = 0;
       }
        else if( Income > 250000 && Income <= 500000 ){
            tax = (Income-250000)*0.05f;    
       }
        else if( Income > 500000  && Income <= 1000000 ){
            tax =(500000-250000)*0.05f+(Income-500000)*0.2f;    
       }
        else{
            tax = (500000-250000)*0.05f + (1000000-500000)*0.2f + (Income-1000000)*0.3f;    
       }

       System.out.println("Your Income Tax = " + tax); 
    }
}