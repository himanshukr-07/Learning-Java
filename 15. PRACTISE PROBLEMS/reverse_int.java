// return reverse of given number

import java.util.Scanner;

class reverse_int{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for reverse");
         int n = sc.nextInt();
         int r = 0 ;
        while(n!=0){
        int f = n % 10;
         r = r*10+ f;
         n/=10;
        }
        System.out.println("Reversed int = "+ r);

    }
}