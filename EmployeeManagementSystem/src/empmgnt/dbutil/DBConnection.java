/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgnt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mayur jain
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
             conn=DriverManager.getConnection("jdbc:oracle:thin:@//MJ:1521/XE","myproject","abc");
            Statement st=conn.createStatement();
           
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"Error loading driver class"+ex,"error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"sql error"+ex,"error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
     }
    
    /**
     *
     * @return
     */
    public static Connection getConnection()
    {
        return conn;
    }
    
   
}
