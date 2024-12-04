package jbook1;
class B extends A
{
 void printB()
 {
  System.out.println(" ");
  System.out.println("printing in sub class B");
  System.out.println("\nx="+x);
  //System.out.println("\nprivate x="+x_pri);
  System.out.println("\nprotected x="+x_pro);
  System.out.println("\npublic x="+x_pub);
 }
}
class C
{
 void printC()
 {
  A a=new A();
  System.out.println(" ");
  System.out.println("printing in non subclass C");
  System.out.println("\nx="+a.x);
  //System.out.println("\nprivate x="+x_pri);
  System.out.println("\nprotected x="+a.x_pro);
  System.out.println("\npublic x="+a.x_pub);
 }
}
class AccessDemo
{
 public static void main(String s[])
 {
  A a=new A();
  B b=new B();
  C c=new C();
  System.out.println("printing in the same package\n");
  a.printA();
  b.printB();
  c.printC();
 }
}
