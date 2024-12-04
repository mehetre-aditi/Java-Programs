import java.io.*;
class SwapNo
{
 double x,y;
 void init(double x,double y)
 {
  this.x=x;
  this.y=y;
 }
 void swap_no()
 {
  x=x+y;
  y=x-y;
  x=x-y;
 }
 void show()
 {
  System.out.println("value of x="+x+"\nValue of y="+y);
 }
}
class SampSwap
{
 public static void main(String s[])
 {
  SwapNo obj=new SwapNo();
  Console cn=System.console();
  cn.printf("Enter any two float type values\n");
  double p=Double.parseDouble(cn.readLine());
  double q=Double.parseDouble(cn.readLine());
  obj.init(p,q);
  System.out.println("Before Swapping\n");
  obj.show();
  obj.swap_no();
  System.out.println("After Swapping\n");
  obj.show();
 }
}
  