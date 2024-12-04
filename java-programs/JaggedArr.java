import java.io.*;
class JaggedArr
{
 public static void main(String args[])
 {
  int a[][]=new int[3][];
  Console cn=System.console();

  a[0]=new int[3];
  a[1]=new int[2];
  a[2]=new int[5];

  System.out.println("Enter elements of jagged array\n");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++) 
   {
    a[i][j]=Integer.parseInt(cn.readLine());
   }
  }

  System.out.println("Two dimensional jagged array\n");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++) 
   {
    System.out.print(a[i][j]+"\t");
   }
   System.out.println();
  }
 }
}