class Finally
{
 public static void main(String s[])
 {
  int i,x,con=2;
  for(i=1;i<=4;i++)
  try
  {
   x=25/(con-i);
   System.out.println("\nquot ="+x);
  }
  catch(ArithmeticException e)
  {
   System.out.println("\ndevide by zero error for i="+i);
  }
  finally
  {
   System.out.println("\nException or no exception this will be printed always");
  }
 }
}
 