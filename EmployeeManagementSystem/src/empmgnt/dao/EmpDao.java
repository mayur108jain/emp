/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgnt.dao;

import empmgnt.dbutil.DBConnection;
import empmgnt.pojo.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author neetesh gour
 */
public class EmpDao {
    public static boolean addEmployee(Emp e)throws SQLException
    {
    
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into emp values(?,?,?)");
        ps.setInt(1,e.getEmpno());
        ps.setString(2,e.getEname());
         ps.setDouble(3,e.getSal());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
    
    public static ArrayList<Emp>getAllEmployee()throws SQLException
    {
        ArrayList<Emp> empList= new ArrayList<Emp>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs =st.executeQuery("Select * from emp");
        while(rs.next())
        {
            Emp e= new Emp();
            e.setEmpno(rs.getInt("Eno"));
            e.setEname(rs.getString("Ename"));
            e.setSal(rs.getDouble("Sal"));
            empList.add(e);
        }
        
        return empList;
   }
    
    public static boolean updateEmployee(Emp e)throws SQLException
    {
        
      Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update emp set ename = ?,sal = ? where eno=?");
        ps.setInt(3,e.getEmpno());
        ps.setString(1,e.getEname());
         ps.setDouble(2,e.getSal());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
    
     public static boolean deleteEmployee(int empno)throws SQLException
    {
        
      Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from emp where eno= ?");
        ps.setInt(1,empno);
        
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else
            return true;
    }
     
     
    public static Emp searchEmployee(int eno)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select * from emp where eno=?");
         ps.setInt(1,eno);
          ResultSet rs =ps.executeQuery();
          if(rs.next())
          {
              
           Emp e=new Emp();
           e.setEname(rs.getString("Ename"));
           e.setSal(rs.getDouble("Sal"));
           e.setEmpno(rs.getInt("Eno"));
           return e;
          }
          else
          return null;
          
          
         
   }
    
    
    
    
}
