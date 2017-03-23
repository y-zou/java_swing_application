
import static java.lang.String.format;
import java.sql.Date;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Test {
    public static void main(String[] args) throws Exception{
       
        
        Frame f = new Frame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        
     
       
            
        
   
 
//        DBInterface db = new DBInterface();
//        DBFlight flight = new DBFlight();
//        //String query2 = "insert into flights values('H005',1)";
//        //db.setUpdate(query2);
//        String query = "select * from FLIGHTS";
//        ResultSet resultSet = db.setQuery(query);
//        ResultSetMetaData metaData = resultSet.getMetaData();
//        
//        int numberOfColumns = metaData.getColumnCount();
//        for(int i = 1; i<=numberOfColumns; i++) 
//           // System.out.printf("%-8s\t",metaData.getColumnName(i));
//        System.out.println();
//               
//        while(resultSet.next()){
//            for(int i = 1; i<=numberOfColumns;i++)
//                //System.out.printf("%-8s\t",resultSet.getObject(i));
//            System.out.println();
//                       
//        }
//        
//      
//       
//   
//       Timestamp currentTimestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
//       String s = currentTimestamp.toString();
//       System.out.println(s);
//       
//        String query3 = "select capacity from flights where flightID = " + "'F002'";
//        ResultSet rs = db.setQuery(query3);
//        int num = -1;
//        if(rs.next())
//            num = rs.getInt(1);
//            
//        System.out.println(num);
//             ///////////////////////////////////////////////////////////////
//        ResultSet res = db.setQuery("select date from dates");
//        List<String> sd = new ArrayList<>();
//        while (res.next()){ 
//            String sod = res.getString(1);
//           sd.add(sod);
//        }
//        
//        System.out.println(sd);
//        db.disconnectDB();
//        
//        DBInterface db2 = new DBInterface();
//        ResultSet res2 = db2.setQuery("select flightid from flights");
//        List<String> sd2 = new ArrayList<>();
//        while (res2.next()){ 
//            String sod2 = res2.getString(1);
//           sd2.add(sod2);
//        }
//        
//        System.out.println(sd2);
//        db2.disconnectDB();
//        
//        DBDate d = new DBDate();
//        String[] date = d.getDate();
//        System.out.println(date);
//       
        
        //db.setQuery("select * from flights");
    
    }
  
}
