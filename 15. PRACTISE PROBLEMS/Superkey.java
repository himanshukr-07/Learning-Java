// shows use of super keyword in java

import java.io.*;
import java.util.Scanner;


class Parent{
    // super key in constructor

    Parent(){
        System.out.println("Parent const is called");
    }

    // super key in method

     void show(){
        System.out.println("Parent method is called");
    }

    // super key in varibale
     int num = 50;
}

class Child extends Parent{

    // super key in constructor
    Child(){
        super();
        System.out.println("Child const is called");
    }

     // super key in method
     void show(){
        super.show();
        System.out.println("Child method is called");
    }

     // super key in varibale
     void display(){
       int num =100;
        System.out.println("Parent variable is called " + super.num);
        System.out.println("Child variable is called " +num);
    }
}

public class Superkey{
    public static void main(String[] args){
       // super key in constructor
       Child cd = new Child();
       // super key in method
       cd.show();
       // super key in varibale
       cd.display();
    }
}

