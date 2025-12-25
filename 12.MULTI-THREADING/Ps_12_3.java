// error handling in thread

class mythd extends Thread{
    public void run(){
       for(int i = 1; i<=3 ; i++){
        System.out.println(getName() + " Running "+i);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
       }
    }
}

public class Ps_12_3{
    public static void main(String[] args){
        mythd t1 = new mythd();
        mythd t2 = new mythd();

        t1.start();
        t2.start();
    }
}