
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//connect to the flights database
public class DBFlight {
    private static Connection conn = DBInterface.getConnection();
    private static PreparedStatement ps; 
    
    
    public static String[] getFlightID() throws Exception{
        ps = conn.prepareStatement("select flightID from flights");
        ResultSet resultset = ps.executeQuery();
        
        List<String> sList = new ArrayList<>();
        while (resultset.next()){ 
            sList.add(resultset.getString(1));
        }
        
        String[] str = new String[sList.size()];
        str = sList.toArray(str);       
        
        return str;
    }
    public static void addFlight(String flightid, int capacity) throws Exception{
        PreparedStatement ps = conn.prepareStatement("insert into flights values(?,?)");
        ps.setString(1,flightid);
        ps.setInt(2, capacity);
        
        ps.executeUpdate();
    }
    
    public static void dropFlight(String flightid) throws Exception{
        PreparedStatement ps = conn.prepareStatement("delete from flights where flightid = ?");
        ps.setString(1, flightid);
        
        ps.executeUpdate();
    }
    
    
}
