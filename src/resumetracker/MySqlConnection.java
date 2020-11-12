/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumetracker;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hyeji
 */
public class MySqlConnection {
    
//    Connecting to local MySql Server
    
    public static Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resumetracker?useUnicode=true& useUnicode=true&characterEncoding=euc_kr","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
