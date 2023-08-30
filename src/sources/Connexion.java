
package sources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    
    private Connection connection;
    
    public Connection Connect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Pilotes charged !");             
        } catch(ClassNotFoundException e){
            //System.out.println("Non charged pilotes !");
        }        
        
        String BDD = "gestion_stock";
        String url = "jdbc:mysql://10.20.30.103:3306/" + BDD;
        String user = "sidate";
        String passwd = "sidate2023";
        
        try{            
            connection = DriverManager.getConnection(url, user, passwd);            
            //System.out.println("Connexion etablie avec la base de donnees !");
        } catch(SQLException e){            
            //System.out.println("Application non connectee !");
            e.printStackTrace();
        }
        
        return connection;
    }
    
}