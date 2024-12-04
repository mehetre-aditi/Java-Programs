class FactNum1
{
 public static void main(String s[])
 int i,n,f=1;
 n=Integer.parseInt(s[0]);
 i=n;
 while(i>=1)
 {
  f=f*i;
  i--;
 }
 System.out.println("Factorial of a no "+n+" is="+f);
 }
}