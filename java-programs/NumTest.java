class Number1
{
   double n,sq,f;
   void input(double num)
   {
      n=num;
      f=1;
      sq=Math.pow(n,2);
      for(int i=1;i<=n;i++)
      {
         f=f*i;
      }
      
   }
   void showdata()
   {
       System.out.println("Number Details are\n");
       System.out.println("Number n="+n);
       System.out.println("Square of a Number ="+sq);
       System.out.println("Factorial of a no ="+f); 
     
   }
}
class NumTest
{
   public static void main(String s[])
   {
      Number1 c1=new Number1();
      c1.input(8);
      c1.showdata();
   }
}     