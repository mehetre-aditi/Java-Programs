package pack2;
import pack1.Student;
public class Example
{
 public static void main(String s[])
 {
  Student s1=new Student();
  s1.setRollno(45);
  s1.setName("Aditi");
  System.out.println("Student Roll Number is="+s1.getRollno());
  System.out.println("Student Name is="+s1.getName());
 }
}