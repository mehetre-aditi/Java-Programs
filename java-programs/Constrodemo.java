import java.io.*;
class Student
{
 int rno;
 String name;
 Student()
 {
  rno=103;
  name="Priya";
 }
 Student(int a,String nm)
 {
  rno=a;
  name=nm;
 }
 Student(Student obj)
 {
  this.rno=obj.rno;
  this.name=obj.name;
 }
 void show()
 {
  System.out.println(rno+"\t"+name);
 }
}
class ConstroDemo
{
 public static void main(String s[])
 {
  Student s1=new Student(100,"Rohit");
  s1.show();
  Student s2=new Student(s1);
  s2.show();
  Student s3=new Student();
  s3.show();
 }
}