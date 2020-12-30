package university.management.system.MVC.controllers;
import university.management.system.MVC.Models.CourseMarks;

import java.sql.ResultSet;

public class MarksController {
    CourseMarks cm =new CourseMarks();
    ResultSet rs;
    public void set(String a, String bb, String c, String d, String e, String ff, String g, String h, String i, String j, String k) {
        String s1 = "insert into subject values('"+a+"','"+bb+"','"+d+"','"+ff+"','"+h+"','"+j+"')";
        String s2 = "insert into marks values('"+a+"','"+c+"','"+e+"','"+g+"','"+i+"','"+k+"')";
        cm.setMarks(s1,s2);

    }

    public ResultSet getMarks(String s) {
        String sql="select * from subject where rollno="+s;
         rs= cm.getMarks(sql);
        return rs;
    }
}
