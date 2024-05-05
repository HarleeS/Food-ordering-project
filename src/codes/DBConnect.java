
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnect {
    
    public static Connection connect(){
        Connection conn=null;
        try{
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorderingsystem","root","");
            
            System.out.println("Connection Ok");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    public static void main(String args[]){
        connect();
    }

}
