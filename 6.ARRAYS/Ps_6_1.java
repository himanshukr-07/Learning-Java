 import java.io.*;

public class Ps_6_1{
      public static void main(String[] args){
        float [] marks = {45.2f ,67.5f , 78.3f , 55.7f , 22.9f};
        float sum = 0;
        for(float add:marks){
            sum+= add;
        }
        System.out.println("The Sum is = "+ sum);
      }
}