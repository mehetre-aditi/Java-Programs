import java.io.*;
class Digit
{
 
 int n,sum=0,rev=0;
 void accept()
 {
  Console cn=System.console();
  cn.printf("Enter any digit number to find its sum and reverse:\n");
  n=Integer.parseInt(cn.readLine());
  int x=n;
  while(x>0)
  {
   int i=x%10;
   sum=sum+i;
   rev=rev*10+i;
   x=x/10;
  }
 }
 void show()
 {
  System.out.println("Sum of digit of a no"+n+" is= "+sum);
  System.out.println("Reverse of a no "+n+" is= "+rev);
 }
}
class Digit1
{
 public static void main(String s[])
 {
  Digit d=new Digit();
  d.accept();
  d.show();
 }
}