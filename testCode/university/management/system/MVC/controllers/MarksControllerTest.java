/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.MVC.controllers;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;
import university.management.system.conn;

/**
 *
 * @author rbsam
 */
public class MarksControllerTest {
    conn c=new conn();
    public MarksControllerTest() {
    }
        /**
     * Test of set method, of class MarksController.
     */
    @Test
    public void testSet() {
        try{
            System.out.println("set");
            String a = "";
            String bb = "";
            String c = "";
            String d = "";
            String e = "";
            String ff = "";
            String g = "";
            String h = "";
            String i = "";
            String j = "";
            String k = "";
            MarksController instance = new MarksController();
            instance.set(a, bb, c, d, e, ff, g, h, i, j, k);
        }catch(Exception e){
            fail("The test case is a prototype.");    
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMarks method, of class MarksController.
     */
    @Test
    public void testGetMarks() {
       try{
        System.out.println("getMarks");
        String s = "";
        MarksController instance = new MarksController();
         String sql="select * from subject where rollno="+s;
        ResultSet expResult =c.s.executeQuery(sql);
        ResultSet result = instance.getMarks(s);
        ResultSet temp = instance.getMarks(s);
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
       
        }catch(Exception E){
        }
    }
}
