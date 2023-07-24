import java.sql.*;

public class userInfo {
    private static final String DB_URL = "";''
    public static void main(String[] args){
        
        //step 1 create a connection to the database
        try (Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:/northwind","root", "admin")) {
            
        }
        
    }

    
}
