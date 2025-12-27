// interface concept example in java

interface CanEat{
   void eat(); 
}
interface CanSleep{
   void sleep(); 
}
interface CanSound{
   void sound(); 
}

class Animal implements CanEat , CanSleep , CanSound{
   public void eat(){
      System.out.println(" Animal can eat");
   }
    public void sleep(){
      System.out.println(" Animal can sleep");
   }
   public void sound(){
      System.out.println(" Animal can sound");
   }
}

public class Interface_eg{
   public static void main(String[] args){
      Animal ab = new Animal();
      ab.eat();
      ab.sleep();
      ab.sound();
   }
}