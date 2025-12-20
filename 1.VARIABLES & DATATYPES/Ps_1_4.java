import java.io.*;
import java.util.Scanner;

public class Ps_1_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght in Kilometer");
        float a = sc.nextFloat();
        float b = 0.62137119f*a;
        System.out.println(a+ " Kilometer = " + b +" Mile");
    }
}
