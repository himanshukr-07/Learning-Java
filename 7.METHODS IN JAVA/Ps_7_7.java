class Ps_7_7{
    int star(int n){
        if(n == 0 ){
           return 0;
        }
        else {
         for(int i = 0 ; i < n ; i ++){
            System.out.print("* ");
         }
         System.out.println();
         return star(n-1);
    }
}
public static void main(String[] args){
    Ps_7_7 ob = new Ps_7_7();
    ob.star(4);
   }
}