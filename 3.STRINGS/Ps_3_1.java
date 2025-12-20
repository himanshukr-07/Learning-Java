import java.io.*;
import java.util.Scanner;

public class Ps_3_1{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a word in uppercase");
     String str = sc.next();
     str = str.toLowerCase();
     System.out.println("Word in lowercase = " + str);
    }
}
