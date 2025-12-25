// Thread by extending thread class

class good extends Thread{
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

class hello extends Thread{
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

class wel extends Thread{
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

public class Ps_12_1{
    public static void main(String[] args){
        new good().start();
        new hello().start();
        new wel().start();
    }
}
