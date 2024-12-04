class PrimeNo
{
 public static void main(String s[])
 {
  int n,i;
  n=Integer.parseInt(s[0]);
  for(i=2;i<n;i++)
  {
   if(n%i==0)
   {
    System.out.println("Given no "+n+" is not prime");
    break;
   }
  }
  if(n==i)
  {
   System.out.println("Given no "+n+" is prime");
  }
 }
}