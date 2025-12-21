import java.io.*;

class Ps_7_2{
    void star(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
  
  public static void main(String[] args){
    Ps_7_2 ob = new Ps_7_2();
    ob.star();
  }
}