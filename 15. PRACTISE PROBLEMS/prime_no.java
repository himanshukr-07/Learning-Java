//checks whether given number is prime or not

import java.util.*;
import java.lang.*;
import java.io.*;

class prime_no
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Checking");
		int n = sc.nextInt();
        boolean isbool = true;
        for(int i = 1 ; i <= n ; i++){
            // if(n > 1 ){
                for(int j = 2 ; j < n ; j++){
                    if(n % j == 0){
                        isbool = false;
                        break;
                    }
                // }
                
            }
        }
         if(isbool){
            System.out.println("It is a prime number");       
         }else{
            System.out.println("It is not a prime number");       
         }
	}
}
