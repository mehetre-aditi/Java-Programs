class Multicatch
{
 public static void main(String s[])
 {
  int []vec={10,20,30,40,50};
  int nmr=24;
  int quot,sum=0;
  for(int i=0;i<=5;i++)
  {
   try
   {
    quot=nmr/(2-i);//12,24,-24,-12,-8
    System.out.println("\n Quotient="+quot);
    sum=sum+vec[i];
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("\nArray index out of bounds at index="+i);
   }
   catch(ArithmeticException e)
   {
    System.out.println("\n Divide by zero error at i ="+i);
   }
  }
  System.out.println("\n Sum of numbers="+sum);
 }
}
 