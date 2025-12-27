// Abstract class example in java

abstract class Shape{
    abstract void area();
}

class circle extends Shape{
void area(){
   System.out.println("Circle Area = " + (3.14*4*4));
}
}

class square extends Shape{
void area(){
   System.out.println("Square Area = " + (4*4));
}     
}

class rect extends Shape{
void area(){
   System.out.println("Rect Area = " + (4*2));
}
}

public class Abstract_eg{
    public static void main(String[] args){
       new circle().area();
       new square().area();
       new rect().area();
    }
}