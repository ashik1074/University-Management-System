package university.management.system.MVC.Models;
import university.management.system.conn;

import java.sql.ResultSet;

public class Teacher {
    conn c1 = new conn();
    ResultSet rs;
    public Teacher(){

    }
    public void addTeacher(String s1) {
        try {
            c1.s.executeUpdate(s1);
        }catch (Exception e){
        }
    }
    public ResultSet getTeacher(String q){
        try {
            rs= c1.s.executeQuery(q);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }
    public void deleteTeacher(String q){
        try {
            c1.s.executeUpdate(q);
        }catch (Exception e){
        }

    }
    public void setAttendance(String q){
        try {
            c1.s.executeUpdate(q);

        }catch (Exception e){
        }
    }
    public ResultSet getAttendance(String q){
        try {
            rs=c1.s.executeQuery(q);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }
    public ResultSet getId(String q){
        try {
            rs=c1.s.executeQuery(q);
            return rs;

        }catch (Exception e){
        }
        return rs;
    }
    public void updateTeacher(String q){
        try {
            c1.s.executeUpdate(q);

        }catch (Exception e){
        }
    }
}
