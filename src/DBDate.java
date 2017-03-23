
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DBDate {
    private static Connection conn = DBInterface.getConnection();
    private static PreparedStatement ps; 
        
    public static String[] getDate() throws Exception{
        ps = conn.prepareStatement("select date from dates");
        ResultSet resultset = ps.executeQuery();
        
        List<String> sList = new ArrayList<>();
        while (resultset.next()){ 
            sList.add(resultset.getString(1));
        }

        String[] str = new String[sList.size()];
        str = sList.toArray(str);       

        return str;
    };
    public static void addDate(String date) throws Exception{
        PreparedStatement ps = conn.prepareStatement("insert into dates values(?)");
        ps.setDate(1,Date.valueOf(date));
        
        ps.executeUpdate();
    }
}
