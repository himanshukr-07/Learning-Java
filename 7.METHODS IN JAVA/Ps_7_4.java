import java.io.*;

class Ps_7_4{
    void star(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5-i ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
  
  public static void main(String[] args){
    Ps_7_4 ob = new Ps_7_4();
    ob.star();
  }
}