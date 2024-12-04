class Medical extends Thread
{
 public void run()
 {
  try
  {
   System.out.println("Medical process start...");
   Thread.sleep(3000);
   System.out.println("Medical process completed");
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
class Testdrive extends Thread
{
 public void run()
 {
  try
  {
   System.out.println("\nTestdrive process start...");
   Thread.sleep(3000);
   System.out.println("Testdrive process completed");
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
class Officer extends Thread
{
 public void run()
 {
  try
  {
   System.out.println("\n\nOfficer takes the file to chk...");
   Thread.sleep(3000);
   System.out.println("Officer's sign is done");
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
class License
{
 public static void main(String s[]) throws InterruptedException
 {
  Medical m1=new Medical();
  m1.start();
  m1.join();
  Testdrive t1=new Testdrive();
  t1.start();
  t1.join();
  Officer f1=new Officer();
  f1.start();
 }
}