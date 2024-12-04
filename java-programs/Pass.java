import java.io.*;
class Pass
{
 public static void main(String arg[])
 {
  Console cn=System.console();
  cn.printf("Enter user name:\n");
  String uname=cn.readLine();
  cn.printf("Enter password:\n");
  char x[]=cn.readPassword();
  String pwd=new String(x);
  cn.printf("User Name=%s\n",uname);
  cn.printf("Password=%s\n",pwd);
 }
}