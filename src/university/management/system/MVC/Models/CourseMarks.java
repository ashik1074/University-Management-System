package university.management.system.MVC.Models;

import university.management.system.conn;

import java.sql.ResultSet;

public class CourseMarks {
    conn c1 = new conn();
    ResultSet rs;

    public CourseMarks(){

    }

    public void setMarks(String s1, String s2) {
        try {
            c1.s.executeUpdate(s1);
            c1.s.executeUpdate(s2);
        }catch (Exception e){
        }
    }
    public ResultSet getMarks(String sql){
        try{
            rs= c1.s.executeQuery(sql);
            return rs;
        }catch (Exception e){
            return rs;
        }
    }
}
