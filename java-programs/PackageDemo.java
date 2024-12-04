package soms;
import jbook1.*;
class D extends A
{
 void printD()
 {
  System.out.println(" ");
  System.out.println("printing in subclass D in another package");
  //System.out.println("\nx="+x);
  //System.out.println("\nprivate x="+x_pri);
  System.out.println("\nprotected x="+x_pro);
  System.out.println("\npublic x="+x_pub);
 }
}
class E
{
 void printE()
 {
  A a=new A();
  System.out.println("Printing in different package,non subclass E");
  System.out.println("public x="+a.x_pub);
 }
}
class PackageDemo
{
 public static void main(String s[]) 
 {
  D d=new D();
  E e=new E();
  System.out.println("\nprinting in different package");
  d.printD();
  e.printE();
 }
}