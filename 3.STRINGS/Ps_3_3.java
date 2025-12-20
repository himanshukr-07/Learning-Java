import java.io.*;
import java.util.Scanner;

public class Ps_3_3{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Name");
       String str1 = sc.nextLine();
       String str2 = "Dear <|name|> , Thanks a lot!";
       str2 = str2.replace("<|name|>", str1);
       System.out.println(str2);
       sc.close();
    }
}
