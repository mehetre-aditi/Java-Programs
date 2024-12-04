interface Test 
{
 void meth1();
}
class Sample implements Test
{
 public void meth1()
 {
  System.out.println("hello guys I am in method 1");
 }
}
class Global implements Test
{
 public void meth1()
 {
  System.out.println("This is Global class implemented from Test interface");
 }
 public void show()
 {
  System.out.println("Welcome to Global IT Hub");
 }
}
class InterfaceDemo
{
 public static void main(String s[])
 {
  Test s1=new Sample();
  s1.meth1();
  Global s2=new Global();
  s1=s2;
  s2.meth1();
  s2.show();
 }
}
