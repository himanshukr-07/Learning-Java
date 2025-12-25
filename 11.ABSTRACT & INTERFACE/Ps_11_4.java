abstract class method{
abstract void ring();
abstract void lift();
abstract void disConnect();
}

class telephone{
   void ring(){
    System.out.println("Ringing");
   }
   void lift(){
    System.out.println("Lifting");
   }
   void disConnect(){
    System.out.println("DisConnected");
   }
}

class Smartphone extends telephone{
    void show(){
        System.out.println("I am Smartphone");
    }
}

public class Ps_11_4{
    public static void main(String[] args){
        telephone ob =  new Smartphone();
        ob.ring();
    }
}

