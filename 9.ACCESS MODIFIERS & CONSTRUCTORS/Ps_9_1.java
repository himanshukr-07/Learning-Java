class cylinder{
    private int r , h ;
   
    private int getHeight(){
      return h;
    }
    private int getRadius(){
      return r;
    }
    public void SetHeightRadius(int r , int h){
      this.r = r; // used when parameter and variable 
      this.h = h; // name is same to reduce confusion
    }

    public void calArea(){
        System.out.println(" Surface Area = "+ (2*3.14*r*(r+h)));
        System.out.println(" Volume = "+ (3.14*r*r*h));

    }

}

class Ps_9_1{
    public static void main(String[] args){
        cylinder ob = new cylinder();
        ob.SetHeightRadius(2,4);
        ob.calArea();

    }
}