class square{
    int a = 0;
    void area(){
     System.out.println("Area = " + (a*a));
     System.out.println("Perimeter = " + (4*a));
    }
}

class Ps_8_3{
    public static void main(String [] args){
        square ob = new square();
        ob.a = 4;
        ob.area();
    }
}