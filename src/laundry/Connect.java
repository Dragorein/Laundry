/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Franz
 */
public class Connect {
    public static Connection con;
    public static Statement stm;
    
    public void config(){
        try {
            String url = "jdbc:mysql://localhost:3306/laundry";
            String userName = "root";
            String password = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            stm = con.createStatement();
//            JOptionPane.showMessageDialog(null,"koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi gagal " +e.getMessage());
        }
    }
}
