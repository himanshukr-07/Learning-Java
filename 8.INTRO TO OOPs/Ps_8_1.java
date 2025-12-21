class employee{
    int salary;
    String name;
   
   int getSalary(){
    return salary;
   }

   String getName(){
    return name;
   }

   void setName(String N){
      name = N;
   }

}

public class Ps_8_1{
    public static void main(String[] args){
        employee ob = new employee();
        ob.setName("Himanshu");
        System.out.println(ob.getName());
        ob.salary = 180000;
        System.out.println(ob.getSalary());
    }
}