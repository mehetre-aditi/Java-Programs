import java.io.*;
class PrimeListSum
{
   public static void main(String s[])
   {
       int i,n,sum=0,cnt=0;  
       Console con=System.console();
       con.printf("Enter How many prime nos you want to add from 1\n");
       int range=Integer.parseInt(con.readLine());
       for(n=1;n<=100;n++)
        {
             for(i=2;i<n;i++)
             {
                 if(n%i==0)
                  {
                     break;
                  }
             }
             if(n==i)
             {
                con.printf("%d\t",n);
                cnt++;
                sum=sum+n;
             }
             if(cnt==range)
             {
                break;
             }
        }
        con.printf("Sum of first %d Prime nos is=%d\n",range,sum);
   }
}  
       