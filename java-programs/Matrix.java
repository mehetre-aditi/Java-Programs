class Matrix
{
 public static void main(String args[])
 {
  int original[][]={{1,2,3},{4,5,6},{7,8,9}};
  int transpose[][]=new int[3][3];
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    transpose[i][j]=original[j][i];
   }
  }
  System.out.println("Matrix without tarnspose:");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.println(original[i][j]+" ");
   }
   System.out.println();
  }
  System.out.println("Matrix After tarnspose:");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.println(transpose[i][j]+" ");
   }
   System.out.println();
  }
 }
}