/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fredr
 */
public class koneksiDb {
    private static Connection konek;
    public static Connection GetConnection()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/crudjava";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            konek=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage());
        }
        if(konek==null){
            new Driver();
            
            konek=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava","root","");
            
        }
        return konek;
    }
}
