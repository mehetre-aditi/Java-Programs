class SumOfDigit
{
 public static void main(String args[])
 {
  int i,n,x,sum=0;
  n=Int.parseInt(args[1]);
  x=n;
  while(n>0)
  {
   i=n%10;
   sum=sum+i;
   n=n/10;
  }
 System.out.println("sum of digit of given number is="+sum);
 }
}  