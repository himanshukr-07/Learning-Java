// normal exception class 

public class Ps_14_1{
    public static void main(String[] args){
     try{
        int a = 10, b = 0;
        int c = a/b;
        System.out.println(c);
     }catch (ArithmeticException e){
        System.out.println("Error : Cannot divide by zero");
     }finally {
        System.out.println("Always Executes");
     }
    }
}