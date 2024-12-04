import java.io.*;
class Table
{
   public static void main(String s[])
   {
       Console cn=System.console();
       cn.printf("Enter any no");
       int n,m,i;
       n=Integer.parseInt(cn.readLine());
       cn.printf("Table of a no %d is\n",n);
       for(i=1;i<=10;i++)
       {
          cn.printf("%d * %d = %d\n",n,i,(n*i));
       }
    }
}
