import java.io.*;
class Employee
{
 private int empid;
 private String ename,post,dname;
 private double basic,da,hra,ta,td,pfd,gs,ns;
 Console cn=System.console();
 Employee()
 {
  cn.printf("\tWelcome to SM Enterprises Ltd.\n");
  cn.printf("*******************************************************");
  cn.printf("\n\nEnter Employee id:\n");
  empid=Integer.parseInt(cn.readLine());
  cn.printf("Enter Employee Name:\n");
  ename=cn.readLine();
  cn.printf("Enter Employee Designation:\n");
  post=cn.readLine();
  cn.printf("Enter Employee Dept.Name:\n");
  dname=cn.readLine();
  cn.printf("Enter Employee basic salary:\n"); 
  basic=Integer.parseInt(cn.readLine());
 }
 void SalCal()
 {
  da=98*basic/100;
  hra=40*basic/100;
  ta=20*basic/100;
  td=18*basic/100;
  pfd=15*basic/100;
  gs=basic+da+hra+ta;
  ns=gs-td-pfd;
 }
 void emp_details()
 {
  cn.printf("\nEmployee Id : "+empid+"\nEmployee Name : "+ename+"\nEmployee Designation : "+post+"\nBasic Salary : "+basic+"\nDA : "
              +da+"\nHRA : "+hra+"\nTA : "+ta+"\nTD : "+td+"\nPFD : "+pfd+"\nGS : "+gs+"\nNS : "+ns);
 }
}
class Emp
{
 public static void main(String s[])
 {
  Employee e1=new Employee();
  e1.SalCal();
  e1.emp_details();
 }
}