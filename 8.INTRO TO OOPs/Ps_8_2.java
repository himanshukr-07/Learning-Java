class cellphone{
    void ring(){
        System.out.println("ringing...");
    }
    void vib(){
        System.out.println("vibrating...");
    }
}

class Ps_8_2{
    public static void main(String[] args){
        cellphone ob = new cellphone();
        ob.ring();
        ob.vib();
    }
}