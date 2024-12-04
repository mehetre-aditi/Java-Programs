interface One
{
 void msg1();
}
interface Two extends One
{
 void msg2();
}
class Sample implements One
{
 public void msg1()
 {
  System.out.println("message from mesg1() method implemented in class Sample");
 }
 public void msg2()
 {
  System.out.println("message from mesg2() method which is resided in interface Two");
 }
}
class InterFaceOne
{
 public static void main(String s[])
 {
  Sample s1=new Sample();
  s1.msg1();
  s1.msg2();
 }
}
