class Employee
{
 int empid;
 String ename;
 static String company="ABC pvt ltd";
 public Employee(int ed,String nm)
 {
  empid=ed;
  ename=nm;
 }
 public void display()
 {
  System.out.println(empid+"\t"+ename+"\t"+company);
 }
}
class StatVarDemo
{
 public static void main(String[] args)
 {
  Employee e1=new Employee(1001,"Vishal");
  Employee e2=new Employee(1002,"Tejas");
  e1.display();
  e2.display();
 }
}
