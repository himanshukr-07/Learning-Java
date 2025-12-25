class rect{

   private int l , b ;

   public void setval(int l , int b){
    this.l = l;
    this.b = b;
   }

   void calArea(){
    System.out.println("Area = " + (l*b));
    System.out.println("Perimeter = " + (2*(l+b)));
   }

}

class cuboid extends rect{

   private int x,y,z;

   public void setval(int x , int y ,int z){
    this.x = x;
    this.y = y;
    this.z = z;
   }

   void calArea(){
    System.out.println("Volume = " + (x*y*z));
    System.out.println("Perimeter = " + (2*(x+y)*z));
   }
}

class Ps_10_4{
    public static void main(String[] args){
      cuboid ob = new cuboid();
      ob.setval(6,4,2);
      ob.calArea();

      rect ab = new rect();
      ab.setval(4,2);
      ab.calArea();
    }
}