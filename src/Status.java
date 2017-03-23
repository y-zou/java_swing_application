
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Status {
    private static Connection conn = DBInterface.getConnection();

    public static List<String[]> flightDay(String flightID, String date) throws Exception{
        PreparedStatement ps = conn.prepareStatement("select timestamp, custumname from booked where flightID =? and date = ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setString(1,flightID);
        ps.setDate(2,Date.valueOf(date));
        ResultSet resultset = ps.executeQuery();
        
        List<String[]> sList = new ArrayList<>();
        while (resultset.next()){ 
            String[] s = {resultset.getString(1),resultset.getString(2)};
            sList.add(s);
        }      
        
        return sList;        
    }
    
    public static List<String[]> waitlistByDay(String date) throws Exception{
        PreparedStatement ps = conn.prepareStatement("select timestamp, custumname,flightid from waitlist where date = ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setDate(1, Date.valueOf(date));
        ResultSet resultset = ps.executeQuery();
        
        List<String[]> sList = new ArrayList<>();
        while (resultset.next()){ 
            String[] s = {resultset.getString(1),resultset.getString(2),resultset.getString(3)};
            sList.add(s);
        }      
        
        return sList;
        
    }
     public static ArrayList<String[]> customerWaitlistStatus(String customerName) throws Exception{
        PreparedStatement ps = conn.prepareStatement("select flightid, date from waitlist where custumname = ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setString(1, customerName);
        ResultSet resultset = ps.executeQuery();
        
        ArrayList<String[]> sList = new ArrayList<>();
        while (resultset.next()){ 
            String[] s = {resultset.getString(1),resultset.getString(2)};
            sList.add(s);
        }      
        return sList;      
    }
     
      public static ArrayList<String[]> customerBookedStatus(String customerName) throws Exception{
        PreparedStatement ps = conn.prepareStatement("select flightid, date from booked where custumname = ?",
                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setString(1, customerName);
        ResultSet resultset = ps.executeQuery();
        
        ArrayList<String[]> sList = new ArrayList<>();
        while (resultset.next()){ 
            String[] s = {resultset.getString(1),resultset.getString(2)};
            sList.add(s);
        }       
        return sList;      
    }
}
