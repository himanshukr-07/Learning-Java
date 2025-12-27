//checks whether given number is armStrong or not

import java.util.*;

class ArmStrongNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ArmStrong Number");
        int num = sc.nextInt();
        int or = num;
        int rem, result = 0;
        while( num != 0){
            rem = num % 10;
            result += Math.pow(rem , 3);
            num /=10;
        }

        if(result == or)
        System.out.println(or +" is a ArmStrong number");
        else
        System.out.println(or + " is not a ArmStrong number");
    }
}