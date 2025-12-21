class Ps_7_6{
    int avg(int a , int b , int c){
        int avgg = (a+b+c)/3;
        System.out.println("Average = " + avgg);
        return 0;
    }

public static void main(String[] args){
    Ps_7_6 ob = new Ps_7_6();
    ob.avg(5,8,4);
}
}