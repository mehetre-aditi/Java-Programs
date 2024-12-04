class ThreadS extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   try
   {
    Thread.sleep(1000,45);
   }
   catch(Exception e)
   {
    System.out.println(e);
   }
   System.out.println(i+" "+Thread.currentThread().getName());
  }
 }
}
class SleepDemo1
{
 public static void main(String s[])
 {
  ThreadS t1=new ThreadS();
  t1.start();
 
  ThreadS t2=new ThreadS();
  t2.start();
 }
}