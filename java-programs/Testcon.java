import java.sql.*;
public class Testcon
{
 public static void main(Strng args[])
 {
  Statement stm;
  ResultSet reset;
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   System.out.println("Drivers are loaded");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","","");
   System.out.println("Connection is established");
   stm=con.createStatement();
   reset=stm.executeQuery("select * from grocery");
   System.out.println("ItemNo\tItemName\tQuantity\tPrice\n");
   while(reset.next())
   System.out.println(reset.getInt("itemno")+"\t"+reset.getString("itemname")+"\t"+reset.getInt("qty")+"\t"+reset.getInt("price")+"\n");
   stm.close();
   con.close();
  }
  catch(SQLException sqe)
  {
   System.out.println("sql error");
  }
  catch(ClassNotFoundException cnf)
  {
   System.out.println("class not found error");
  }
 }
}