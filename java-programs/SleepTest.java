class SleepTest
{
 public static void main(String s[]) throws InterruptedException
 {
  for(int i=1;i<=10;i++)
  {
   System.out.println(i);
   Thread.sleep(1000);
  }
 }
}