class SleepDemo
{
 public static void main(String s[])
 {
  for(int i=1;i<=5;i++)
  {
   try
   {
    Thread.sleep(1000);
   }
   catch(Exception e)
   {
    e.printStackTrace();
   }
   System.out.println(i);
  }
 }
}