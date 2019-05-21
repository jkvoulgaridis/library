/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.libraryui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kostas
 */
public class ConnectionDB {
    /**
     * Creates new ConnectionDB
     */
    public ConnectionDB() {
        ConnectToMysqlDatabase();
    }
    
    private void ConnectToMysqlDatabase() {
        // Connection strings //
        String mysql_url = "jdbc:mysql://127.0.0.1:3306/Library";
        String mysql_driver = "com.mysql.jdbc.Driver";
        String mysql_user = "root";
        String mysql_passwd = "manos1998";
        
        try {
            connection = DriverManager.getConnection(mysql_url, mysql_user, mysql_passwd);
        }
        catch (SQLException ex) {
            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(null, "Error on Database connection!" );
            System.exit(0);
        }
    }
    
    public void closeCon() {
        try {
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error on close Database!" );
        }
    }

    
    public Connection connection = null;
    
}
