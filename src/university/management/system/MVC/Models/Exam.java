package university.management.system.MVC.Models;

import university.management.system.conn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam {
    conn con = new conn();
    ResultSet rs;
    public Exam(){

    }
    public ResultSet getResults(String sql){
       try {
           PreparedStatement st = con.c.prepareStatement(sql);
           rs= st.executeQuery();
           return rs;
       }catch(Exception e){

       }
        return rs;
    }
}
