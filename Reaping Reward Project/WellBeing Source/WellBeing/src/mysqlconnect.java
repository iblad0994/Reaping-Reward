/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SKYLEAD GLOBAL COY
 */
import java.sql.* ;
import javax.swing.* ;

public class mysqlconnect {
    Connection conn = null ;
    public static String IP ;
    public static Connection ConnectDb() {
      
        try {
           Class.forName("com.mysql.jdbc.Driver").newInstance() ;
      //  IP = "192.168.1.101" ;
         // IP = "8.1.0.2" ;
   IP = "204.93.159.42" ;
        //  IP = "localhost" ;
       Connection conn = DriverManager.getConnection("jdbc:mysql://"+IP+":3306/reaping_db","reaping_user", "Rea@2018");
  //   Connection conn = DriverManager.getConnection("jdbc:mysql://"+IP+"/wellbeing","root", "");
        return conn ;
        
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);  
         
          return null;
        }
         
    }
    
}
