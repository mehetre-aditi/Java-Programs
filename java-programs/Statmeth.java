class Sum1
{
 static int a,b;
 public Sum1(int x,int y)
 {
  a=x;
  b=y;
 }
 public static void addy()
 {
  int c=a+b;
  System.out.println("Addition of two nos="+c);
 }
}
class Statmeth
{
 public static void main(String s[])
 {
  Sum1 s1=new Sum1(18,19);
  Sum1.addy();
 }
}