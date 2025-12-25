class Base{
    Base(){
        System.out.print("Base ");
    }

}
class derived extends Base{
    derived(){
        System.out.print("derived ");
    }

}
class derived2 extends derived{
  derived2(){
        System.out.print( "derived2 ");
    }

}

class Ps_10_5{
    public static void main(String[] args){
     derived2 ob = new derived2();
    }
}