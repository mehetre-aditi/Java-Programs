import java.io.*;
class MatAdd
{
 public static void main(String args[])
 {
  int a[][]=new int[2][2];
  int b[][]=new int[2][2];
  int c[][]=new int[2][2];
  int i,j;
  Console con=System.console();

  con.printf("Enter elements of matrix A:\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    a[i][j]=Integer.parseInt(con.readLine());
   }
  }

  con.printf("Matrix A\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    con.printf("%d\t",a[i][j]);
   }
  con.printf("\n");
  }
 
 con.printf("Enter elements of matrix B:\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    b[i][j]=Integer.parseInt(con.readLine());
   }
  }

  con.printf("Matrix B\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    con.printf("%d\t",b[i][j]);
   }
  con.printf("\n");
  }

  con.printf("Addition of Matrix A and B is\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    c[i][j]=a[i][j]+b[i][j];
   }
  }

  con.printf("Matrix C:\n");
  for(i=0;i<2;i++)
  {
   for(j=0;j<2;j++)
   {
    con.printf("%d\t",c[i][j]);
   }
  con.printf("\n");
  }
 }
}



  