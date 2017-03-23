
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBInterface{    
    final static String DATABASE_URL = "jdbc:derby://localhost:1527/FlightSchedulerYiyueZouyxz5480";
    
    private static final Connection conn;
    
    static {
     Connection temp = null;
     try {
       temp = DriverManager.getConnection(DATABASE_URL,"app","java");
     } catch (SQLException ex) {
       // Handle exception.
     }
     conn = temp;
   }

   
    public static Connection getConnection(){
        return conn;
    }
  

    public void disconnectDB(){
            try{              
                conn.close();
            }
            catch(SQLException sqlException){
                sqlException.printStackTrace();
            }       
    }
    
}
