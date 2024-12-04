class TestDae extends Thread
{
 public void run()
 {
  if(Thread.currentThread().isDaemon())
  {
   System.out.println("Daemon Thread");
  }
  else
  {
   System.out.println("Child Thread");
  }
 }
 public static void main(String s[])
 {
  //System.out.println("main Thread");
  TestDae t=new TestDae();
  t.setDaemon(true);
  t.start();
 }
}
