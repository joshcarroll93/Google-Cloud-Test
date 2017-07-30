/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketscreengui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Josh
 */
public class DatabaseQuerys {
    String host = "jdbc:mysql://localhost:3306/world";
    String uName = "root";
    String uPass = "P4ssw0rddb";
    
    public boolean retrieveLunchOrders(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(host, uName, uPass);
            Statement statement = connection.createStatement();
            TicketScreenGUI.orderResultSet = statement.executeQuery("SELECT * FROM lunchMenu");
        }catch(SQLException sql){
            sql.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        if(TicketScreenGUI.orderResultSet != null){
            return true; //content retrieved
        }
        return false;   //no content found, something went wrong..
       
    }
    public boolean retrieveBreakfastOrders(){
        //Get info and populate resultsSet;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(host, uName, uPass);
            Statement statement = connection.createStatement();
            TicketScreenGUI.orderResultSet = statement.executeQuery("SELECT * FROM breakfastMenu");
        }catch(SQLException sql){
            sql.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
        if(TicketScreenGUI.orderResultSet != null){
            return true; //content retrieved
        }
        return false;   //no content found, something went wrong..
        
    }
}
