// shows the default value of datatypes

import java.io.*;

public class DefaultVal{
    int i;
    char c;
    boolean b;
    float f;
    double d;
    short s;
    byte t;
   public static void main(String[] args){
    DefaultVal dd = new DefaultVal();
    System.out.println("int = " +dd.i);
    System.out.println("float = "+ dd.f);
    System.out.println("char = " +dd.c);
    System.out.println("short = "+ dd.s);
    System.out.println("byte = "+ dd.t);
    System.out.println("boolean = "+ dd.b);
    System.out.println("double = "+ dd.d);
   }
}
