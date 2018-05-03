/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdaftardonasi.Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Razikk
 */
public class Database {
    private static Connection connection = null;
    
    public static Connection getConnection() throws Exception{
        if(connection == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/panti","root","");
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        return connection;
    }
    
    public static boolean isConnect(){
        try{
            if(getConnection() == null){
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
