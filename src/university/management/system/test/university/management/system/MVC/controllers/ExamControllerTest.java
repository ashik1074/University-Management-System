/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.test.university.management.system.MVC.controllers;

import java.sql.ResultSet;
import org.junit.Test;
import university.management.system.MVC.controllers.ExamController;
//import static org.junit.Assert.*;
import university.management.system.conn;
/**
 *
 * @author rbsam
 */
public class ExamControllerTest {
   conn c=new conn();
    /**
     * Test of get method, of class ExamController.
     */
    @Test
    public void testGet() {
       try{ System.out.println("get");
        ExamController instance = new ExamController();
        String sql="select * from student";
        ResultSet expResult =c.s.executeQuery(sql);
        ResultSet result = instance.get();
        ResultSet temp=instance.get();
        boolean flag=true;
        while(temp.next()){
            if(result.next()==expResult.next()){
            }else{
              flag=false;
            }
        }
        if(flag){
        }else{
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
        }catch(Exception e){
        }
        
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
