import java.io.*;
import java.util.Scanner;

public class Ps_3_2{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a word with Space");
     String str = sc.nextLine();
     str = str.replace(' ' , '_');
     System.out.println("Word = " + str);
    }
}
