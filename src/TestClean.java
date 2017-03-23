
import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yiyue
 */
public class TestClean {
    private static Connection conn = DBInterface.getConnection();
    private static PreparedStatement ps; 
    
    public static void cleanDate() throws Exception{
        ps = conn.prepareStatement("delete from dates where 1=1");
        ps.executeUpdate();
        
    }
    public static void cleanFlightid() throws Exception{
        ps = conn.prepareStatement("delete from flights where 1=1");
        ps.executeUpdate();
    }
    public static void cleanBooked() throws Exception{
        ps = conn.prepareStatement("delete from booked where 1=1");
        ps.executeUpdate();
    }
    public static void cleanWaitlist() throws Exception{
        ps = conn.prepareStatement("delete from waitlist where 1=1");
        ps.executeUpdate();
    }
}
