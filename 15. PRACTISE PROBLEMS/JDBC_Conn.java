// shows jdbc connection

import java.sql.*; 
public class JDBC_Conn{
    public static void main(String [] args) throws Exception{
       Class.forName();
       Connection con = DriverManager.getConnection();
       System.out.println("Connected");
       con.close();
    }
}