class Ps_7_5{
    int fibo(int n){
        if(n == 0 || n == 1 ){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    
    }


public static void main(String [] args){
    Ps_7_5 ob = new Ps_7_5();
    System.out.println(ob.fibo(5));
  }
}