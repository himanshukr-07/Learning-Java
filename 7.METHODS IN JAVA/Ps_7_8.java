class Ps_7_8{
    void star(int n){
        if(n == 0 ){
           return ;
        }
        else {
          star(n-1);
         for(int i = 0 ; i < n ; i ++){
            System.out.print("* ");
         }
         System.out.println();

    }
}
public static void main(String[] args){
    Ps_7_8 ob = new Ps_7_8();
    ob.star(4);
   }
}