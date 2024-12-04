class NestedTry
{
 public static void main(String s[])
 {
  int []vec={3,5,4,10,2};
  int nmr=24;
  int quot,sum=0;
  for(int i=0;i<=5;i++)
  {
   try
   {
    quot=nmr/(2-i);
    try
    {
     sum=sum+vec[i];
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
     System.out.println("\nArray index out of bounds at index(inner try)="+i);
    }
    catch(ArithmeticException e)
    {
     System.out.println("\n Devide by zero error at i (inner try)="+i);
    }
    System.out.println("\n Quotient="+quot);
   } 

   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("\nArray index out of bounds at index(outer try)="+i);
   }
   catch(ArithmeticException e)
   {
    System.out.println("\n Devide by zero error at i (outer try)="+i);
   } 
  }
  System.out.println("\nSum of numbers="+sum);
 }
}