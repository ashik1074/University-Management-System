package university.management.system.MVC.controllers;

import university.management.system.MVC.Models.Exam;

import java.sql.ResultSet;

public class ExamController {
    Exam e =new Exam();
    ResultSet rs;
    public ResultSet get() {
        String sql="select * from student";
        rs=e.getResults(sql);
        return rs;

    }
}
