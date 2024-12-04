import java.util.Scanner;
class Student
{
 int rno;
 String name;
 String add;
 public Student()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter RollNumber");
  rno=sc.nextInt();
  System.out.println("Enter Name of Student");
  name=sc.next();
  System.out.println("Enter address of Student");
  add=sc.next();
 }
 void display()
 {
  System.out.print(rno+"\t"+name+"\t"+add);
 }
}
class Test extends Student
{
 float m1,m2,total,per;
 Test()
 {
  super();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter marks of two subjects");
  m1=sc.nextFloat();
  m2=sc.nextFloat();
  total=m1+m2;
  per=total/2;
 }
 void display()
 {
  super.display();
  System.out.print("\t"+m1+"\t"+m2+"\t"+total+"\t"+per);
 }
}
class inheritDemo
{
 public static void main(String s[])
 {
  Test t1=new Test();
  System.out.println("Rollno\tName\tAdd\tm1\tm2\tTotal\tPer\n");
  t1.display();
 }
}
 