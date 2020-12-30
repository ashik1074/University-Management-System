package university.management.system;

import java.sql.*;  

public class conn{
    public Connection c;
    public Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","");    
            s =c.createStatement();             
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
