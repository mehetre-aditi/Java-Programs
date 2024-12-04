interface Deposit
{
 public abstract void interest(double prin,double rt,double noy);
}
class Simple implements Deposit
{
 public void interest(double p,double r,double n)
 {
  double total,intr;
  intr=p*r*n/100;
  total=p+intr;
  System.out.println("simple interest received on amount"+p+"is"+intr);
  System.out.println("total amt="+total);
 }
}
class Compound implements Deposit
{
 public void interest(double p,double r,double n)
 {
  double total,intr;
  total=p*Math.pow(1+r/100,n);
  intr=total-p;
  System.out.println("compound interest received on amount"+p+"is"+Math.ceil(intr));
  System.out.println("total amt="+Math.ceil(total));
 }
}
class Inter
{
 public static void main(String s[])
 {
  Simple s1=new Simple();
  Compound c1=new Compound();
  Deposit d1;
  d1=s1;
  d1.interest(10000,10,3);
  d1=c1;
  d1.interest(10000,10,3);
 }
}
  