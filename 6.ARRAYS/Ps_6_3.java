import java.io.*;

public class Ps_6_3{
      public static void main(String[] args){
        System.out.println("Average Marks of Students in Physics");
        float [] marks = {45.2f ,67.5f , 78.3f , 55.7f , 22.9f};
        float sum = 0;
        for(float add:marks){
            sum+= add;
        }
        sum = sum/5;
        System.out.printf("%.2f" , sum);
      }
}

//  two print decimal upto 2 digit
// System.out.println(String.format("%.2f", number));
// System.out.printf("%.2f%n", number);
// import java.text.DecimalFormat;