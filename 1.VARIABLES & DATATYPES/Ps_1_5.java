import java.io.*;
import java.util.Scanner;

public class Ps_1_5{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
  float a = sc.nextFloat();
if(a == (int) a){
System.out.println("It is an Integer");
}
else{
System.out.println("It is not an Integer");
}
sc.close();
}
}
