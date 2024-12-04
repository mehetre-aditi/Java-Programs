import java.lang.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
public class SqlconUcanAccess
{
 public static void main(String args[])
 {
  Statement stm;
  ResultSet reset;
  try
  {
   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   System.out.println("drivers are Successfully loaded");
   String dturl="jdbc:ucanaccess:\\C:\\StudentDatabase.accdb";
   Connection conect= DriverManager.getConnection(dturl);
   System.out.println("Connection is established");
   stm=conect.createStatement();
   String str="select * from stud";
   reset=stm.executeQuery(str);
   System.out.println("RollNo\tName\tAddress\tDOB\tBranch\tMobileNo");
   System.out.println(reset.getInt("rno")+"\t"+reset.getString("sname")+"\t"+reset.getString("address")+"\t"+reset.getString("dob")+"\t"+
                      reset.getString("branch")+"\t"+reset.getString("mobileno")+"\n");
   stm.close();
   conect.close();
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