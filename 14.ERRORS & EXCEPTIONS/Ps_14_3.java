// implementing user defined exception

class User_exception extends Exception{
     User_exception(String msg){
        super(msg);
     }
}

public class Ps_14_3{
    public static void main(String[] args){
        int b = 5000;
        int w = 6000;
        try{
            if(w>b){
                throw new User_exception("Insufficient Balance");
            }else{
                System.out.println("successful");
            }
        }catch(User_exception e){
            System.out.println("Exception " + e.getMessage());
        }finally{
            System.out.println("Completed");

        }
    }
}