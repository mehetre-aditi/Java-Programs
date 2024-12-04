import java.sql.*;
public class insert
{
 public static void main(String args[])
 {
  Statement stm;
  ResultSet reset;
  String sql,record1,record2,record3,record4;
  try
  {
   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   Connection conect= DriverManager.getConnection("jdbc:ucanaccess://C://StudentDatabase.accdb");
   stm=conect.createStatement();
   sql="create table pricelist(item varchar2(30),price number)";
   stm.executeUpdate(sql);
   record1="insert into pricelist(item.price) values('Sandal soap',18.75)";
   record2="insert into pricelist(item.price) values('Neem soap',18.75)";
   record3="insert into pricelist(item.price) values('Baby soap',18.75)";
   record4="insert into pricelist(item.price) values('Shampoo',18.75)"; 
   stm.executeUpdate(record1);
   stm.executeUpdate(record2);
   stm.executeUpdate(record3);
   stm.executeUpdate(record4);
   conect.commit();
   String select="select * from pricelist"; 
   reset=stm.executeQuery(select);
   System.out.println(reset.getString("item")+"\t"+reset.getDouble("price"));
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