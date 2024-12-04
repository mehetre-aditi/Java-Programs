import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class AccessConnectivity
{
 public static void main(String args[])
 {
  try 
  {
   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   Connection connection= DriverManager.getConnection("jdbc:ucanaccess://C:\\StudentDatabase.accdb");
   System.out.println("Connected Successfully");
  }
  catch(Exception e)
  {
   System.out.println("Error in connection");
  }
 }
}