package Oprek;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ibnuzaki
 */
public class Conn {

    private static Connection koneksi;
    public static String PathReport = System.getProperty("user.dir") + "/src/Report/";
    
    private String database, user, pass, host, port;
    public Properties mypanel, myLanguage;
    private String strNamePanel;
    Statement st;
    String Sql;

    public String SettingPanel(String nmPanel) {
        try {
            mypanel = new Properties();
            mypanel.load(new FileInputStream("database.ini"));
            strNamePanel = mypanel.getProperty(nmPanel);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Koneksi", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return strNamePanel;
    }

    public Connection connect() {
        database = SettingPanel("DBDatabase");
        user = SettingPanel("DBUsername");
        pass = SettingPanel("DBPassword");
        port = SettingPanel("port");
        host = SettingPanel("host");
        try {
                String url="jdbc:mysql://"+host+":"+port+"/"+database;
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,pass);
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi gagal karena : " + e);
            }
        return koneksi;
    }
}