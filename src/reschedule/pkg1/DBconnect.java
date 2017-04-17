/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reschedule.pkg1;

import java.sql.*;
import java.sql.Connection;
import javax.swing.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DBconnect 
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBconnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysgl://localhost:3306/hc","root","1234");
            st = con.createStatement();
            
JOptionPane.showMessageDialog(null, "successfully inserted"); ///////????not imp?!>> sara
        }
        catch(Exception ex)
        {
            System.out.println("Erro:"+ex);
        }
        
    }}

   /* public ResultSet query_exe(String query1)
    {
        try
        {
          
            rs = st.executeQuery(query1);
           // while(rs.next())
             //////   string  = rs.getString("");////////////////
              //////  string 
                
        } catch(Exception ex)
        {
            System.out.println(ex);
        }
    
    return rs;
    }*
}
