import java.io.*;
import java.util.Scanner;

 public class Ps_7_1{
     public static void main(String[] args){
        mai p = new mai();
        p.table();
    }

   
}

 class mai{
    void table(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter No. for Multi-table");
       int n = sc.nextInt();
       for(int i = 1 ; i <= 10 ; i++){
        System.out.println(n + " X "+ i +" = "+ (n*i));
       }    
    }
}