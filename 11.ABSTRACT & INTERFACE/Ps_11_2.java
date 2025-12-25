abstract class Pen{
    abstract void write();
    abstract void refil();
}

class FountainPen{
    void change(){
        System.out.println("Changing nib");
    }
    void write(){
        System.out.println("Writing");
    }
    void refil(){
        System.out.println("Refiling");
    }
}

public class Ps_11_2{
    public static void main(String[] args){
        FountainPen ob = new FountainPen();
        ob.change();
        ob.write();
        ob.refil();
    }
}