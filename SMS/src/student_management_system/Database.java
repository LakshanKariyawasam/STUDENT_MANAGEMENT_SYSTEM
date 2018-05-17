package student_management_system;

import java.sql.*;
import javax.swing.JOptionPane;
public class Database 
{
    private Connection con;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
        
    public Connection setConnection(/*String path, String uname, String passwd */)
    {  
        try 
        {
            //con = DriverManager.getConnection(path, uname, passwd);
            con = DriverManager.getConnection("jdbc:mysql://localhost/sms_db", "root", "");
            st = con.createStatement();
            //JOptionPane.showMessageDialog(null, "Database successfully connected...");   
            return con;        
        }
        
        catch (SQLException ex) 
        {            
            JOptionPane.showMessageDialog(null, "Database Not Connected...\n Please contact your system Administrator...");            
            return null;
        }
    }
    
    //close database connection
    public void closeCon()
    {
        try 
        {
            con.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);            
        }
    }
    
    //Insert Update Delete queries execute
    public int save_delete_update(String query)
    {
        int rw = 0;
        try 
        {
            rw = st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Record added successfully...");
        } 
        catch (SQLException ex) 
        {         
            JOptionPane.showMessageDialog(null, ex);
        } 
        return rw;
    }
    
    //Generate auto ID
    public int getMaxID(String query)
    {
        int x = 0;
        try 
        {             
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next())
            {
                x = rs.getInt(1);
            }          
        } 
        catch (SQLException ex) 
        {            
            System.out.println("Cannot get Auto ID...\n" + ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return x;
    }
    
    public ResultSet getResult(String query)
    {
        try
        {
            st = con.createStatement();
            rs = st.executeQuery(query);
        }
        
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return rs;
    }    
}
