class ArithExp
{
 public static void main(String s[])
 {
  try
  {
   int a=100,b=0,c;
   c=a/b;
   System.out.println(c);
  }
  catch(ArithmeticException e)
  {
   System.out.println(e);
  }
  finally
  {
   System.out.println("I am in finally block");
  }
 }
}