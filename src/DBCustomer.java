
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DBCustomer {
    private static final Connection conn = DBInterface.getConnection();
  
        
    public static void addCustomer(Timestamp timestamp, String customerName, Date date, String flightID)
            throws Exception{     
        if (DBCustomer.checkFull(date, flightID))
            addToWaitlist(timestamp,customerName,date,flightID);
        else
            addToBooked(timestamp,customerName,date,flightID);
                
        
    }
    public static List<String> queryCustomer() throws Exception{
        PreparedStatement ps = conn.prepareStatement("select custumname from waitlist",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultset = ps.executeQuery();
        List<String> sList1 = new ArrayList<>();
        while(resultset.next())
            sList1.add(resultset.getString(1));
        ps = conn.prepareStatement("select custumname from booked",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultset = ps.executeQuery();
        List<String> sList2 = new ArrayList<>();
        while(resultset.next())
            sList2.add(resultset.getString(1));
        sList1.addAll(sList2);
        
        
        List<String> sList = new ArrayList<>();
        for(String s : sList1)
            if(!sList.contains(s))
                sList.add(s);
        
        return sList;
    }
    
    public static void addToWaitlist(Timestamp timestamp, String customerName, Date date, String flightID)
            throws Exception{
        //timestamp.toString(),customerName,date.toString(),flightID
        
        PreparedStatement ps = conn.prepareStatement("insert into waitlist values(?,?,?,?)");
           
        ps.setTimestamp(1,timestamp);
        ps.setString(2, customerName);
        ps.setDate(3,date);
        ps.setString(4,flightID);
        
        ps.executeUpdate();
        
    }
     public static void addToBooked(Timestamp timestamp, String customerName, Date date, String flightID)
            throws Exception{
        //timestamp.toString(),customerName,date.toString(),flightID
        
        PreparedStatement ps = conn.prepareStatement("insert into booked values(?,?,?,?)");
           
        ps.setTimestamp(1,timestamp);
        ps.setString(2, customerName);
        ps.setDate(3,date);
        ps.setString(4,flightID);
        
        ps.executeUpdate();
        
    }
    public static boolean checkFull(Date date, String flightID) throws Exception{           
        
        PreparedStatement ps1 = conn.prepareStatement("select capacity from flights where flightID = ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps1.setString(1, flightID);
        ResultSet resultSet1 = ps1.executeQuery();
        resultSet1.next();
        int capacity = resultSet1.last() ? resultSet1.getInt(1) : 0;     
        resultSet1.next();
        
        PreparedStatement ps2 = conn.prepareStatement("select count(*) from booked where date=? and flightID = ?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps2.setDate(1, date);
        ps2.setString(2, flightID);
        ResultSet resultSet2 = ps2.executeQuery();
        resultSet2.next();
        int bookedNumber = resultSet2.last() ? resultSet2.getInt(1) : 0;
        
        return bookedNumber >= capacity;
    }
    
    public static List<String> removeFromWaitlist(String passengerName, String date) throws Exception{
        PreparedStatement ps = conn.prepareStatement("select flightid from waitlist where custumname = ? and date =?");
        ps.setString(1, passengerName);
        ps.setDate(2, Date.valueOf(date));
        ResultSet resultset = ps.executeQuery();
        List<String> sList = new ArrayList<>();
        while(resultset.next())
            sList.add(resultset.getString(1));
        
        ps = conn.prepareStatement("delete from waitlist where custumname = ? and date = ?");
        ps.setString(1, passengerName);
        ps.setDate(2, Date.valueOf(date));
        ps.executeUpdate();
        
        return sList;
    }
    
    public static List<String[]> removeFromBooked(String passengerName, String date) throws Exception{        
        PreparedStatement queryPS = 
                conn.prepareStatement("select flightid from booked where custumname = ? and date = ?",
                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        queryPS.setString(1, passengerName);
        queryPS.setDate(2, Date.valueOf(date));
        ResultSet resultSet =  queryPS.executeQuery();
        List<String[]> sList = new ArrayList<>(); 
        
        while (resultSet.next()){ 
            String fId = resultSet.getString(1);
            PreparedStatement ps = 
                conn.prepareStatement("select timestamp, custumname from waitlist where flightid=? and date=? order by timestamp");

            ps.setString(1,fId);
            ps.setDate(2,Date.valueOf(date));
            ResultSet result = ps.executeQuery();
            
            String waitPassenger = null;   
            
            if(result.next()){
                Timestamp timestamp = result.getTimestamp(1);
                waitPassenger = result.getString(2);
                
                if(waitPassenger!=null){
                    removeFromWaitlist(waitPassenger,date);
                    DBCustomer.addToBooked(timestamp,waitPassenger,Date.valueOf(date),fId);
                    //return flightid
                }
                String[] s = {fId ,waitPassenger};
                sList.add(s);
            }
        } 
        
        PreparedStatement updatePS = 
                conn.prepareStatement("delete from booked where custumname = ? and date = ?");
        updatePS.setString(1, passengerName);
        updatePS.setDate(2, Date.valueOf(date));      
        int rows = updatePS.executeUpdate();
        return sList;
    }
    
    
    public static void removeFromWaitlist(String passengerName, String date, String flightid) throws Exception{
        PreparedStatement ps = 
                conn.prepareStatement("delete from booked where custumname = ? and date = ? and flightid = ?",
                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setString(1, passengerName);
        ps.setDate(2, Date.valueOf(date));
        ps.setString(3,flightid);
        ps.executeUpdate();
    }
    
    
    public static void removeFromBooked(String passengerName, String date, String flightid) throws Exception{
        PreparedStatement ps = 
                conn.prepareStatement("delete from booked where custumname = ? and date = ? and flightid = ?",
                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ps.setString(1, passengerName);
        ps.setDate(2, Date.valueOf(date));
        ps.setString(3,flightid);
        ps.executeUpdate();
    }
    
    
     public static List<String[]> removeFromWaitlistByFlight(String flightid)throws Exception{
        PreparedStatement ps1 = conn.prepareStatement("select custumname,date from waitlist where flightid = ?");
        ps1.setString(1, flightid);
        ResultSet resultSet  = ps1.executeQuery();
        List<String[]> sList = new ArrayList<>();
        
        while(resultSet.next()){
            DBCustomer.removeFromWaitlist(resultSet.getString(1), resultSet.getDate(2).toString(),flightid);
            String[] s = {resultSet.getString(1), resultSet.getDate(2).toString()};
            sList.add(s);
        }        
        return sList;
    }
     
    public static ArrayList<String[]> removeFromBookedByFlight(String flightid)throws Exception{
        PreparedStatement ps1 = conn.prepareStatement("select timestamp,custumname,date from booked where flightid = ?");
        ps1.setString(1, flightid);
        ResultSet resultSet  = ps1.executeQuery();
       
        ArrayList<String[]> sList = new ArrayList<>();
        
        while (resultSet.next()){             
            Timestamp timestamp = resultSet.getTimestamp(1);
            String passengerName = resultSet.getString(2);
            Date date = resultSet.getDate(3);      
            
            removeFromBooked(passengerName,date.toString(),flightid);
            
            ArrayList<String> flightList = new ArrayList<>();
            
            for(String fID : DBFlight.getFlightID()){
                if(!DBCustomer.checkFull(date,fID))
                    flightList.add(fID);
            }
            String newFlightid = null;
            
            if(!flightList.isEmpty()){
                newFlightid = flightList.get(0);
                DBCustomer.addToBooked(timestamp, passengerName, date, newFlightid);
            }
            String[] s = {passengerName, date.toString(),newFlightid};
            sList.add(s);
            
        } 
        return sList;
    } 
    
}
