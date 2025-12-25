// thread by implementing runnable

 class good implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
                System.out.println("Error: Good Morning");
        }
    }
}
class hello implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("hello");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
                System.out.println("Error: hello");
        }
    }
}


class wel implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("welcome");
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){
                System.out.println("Error: Welcome");
        }
    }
}

public class Ps_12_2{
    public static void main(String[] args){
        new Thread(new good()).start();
        new Thread(new hello()).start();
        new Thread(new wel()).start();

    }
}