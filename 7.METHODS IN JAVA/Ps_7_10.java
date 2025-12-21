class Ps_7_10{

    int sum(int n){
        int sum = 0;
      for(int i = 0; i <= n ; i++ ){
          sum += i ;
      }
      System.out.println("Sum = " +sum);
      return 0;
    }

 public static void main(String [] args){
    Ps_7_10 ob = new Ps_7_10();
    ob.sum(10);
 }
}