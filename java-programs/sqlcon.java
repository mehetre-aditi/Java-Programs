import java.sql.*;
public class sqlcon
{
 public static void main(String args[])
 {
  Statement stm;
  ResulSet reset;
  try
  {
   Class.forNmae("sun.jedbc.odbc.JdbcOdbcDriver");
   System.out.println("Drivers are successfully loaded");
   Connection concept=DriverManager.getConnection("jdbc:odbc:StudentData");
   System.out.println("Connection is established");
   stm=concet.createStatement();
   reset=stm.executeQuery("select * from student");
   System.out.println("RollNo\tName\tAddress\tBdate\tMobileNumber\tBranch\n");
   while(reset.next())
   {
    System.out.println(reset.getInt("rollno")+"\t"+reset.getString("sname")+"\t"+reset.getString("address")+"\t"+
    reset.getString("address")+"\t"+reset.getString("dob")+"\t"+reset.getString("mobileno")+"\t"+reset.getString
    ("branch")+"\n");
   }
   stm.close();
   concet.close();
  }
  catch
  {
   System.out.println("sql error");
  }
  catch(ClassNotFoundException cnf)
  {
   System.out.println("class not found error");
  }
}
  
 