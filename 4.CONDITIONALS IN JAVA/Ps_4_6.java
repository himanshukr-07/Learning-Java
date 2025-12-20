import java.io.*;
import java.util.Scanner;

public class Ps_4_6{
    public static void main(String[] args){
        System.out.println("Enter a website");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.endsWith(".com")){
            System.out.println("It is a Commercial Website");          
        }
        else if(a.endsWith(".org")){
            System.out.println("It is a Organization Website");
        }
        else{
            System.out.println("It is an Indian Website");
        }
    }
}
