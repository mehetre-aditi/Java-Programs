class StudResult
{
 public static void main(String args[])
 {
  double s1,s2,s3,total,per;
  String result;
  s1=Double.parseDouble(args[0]);
  s2=Double.parseDouble(args[1]);
  s3=Double.parseDouble(args[2]);
  total=s1+s2+s3;
  per=total/3;
  System.out.println("Total marks are : "+total);
  System.out.println("Percentage are : "+per);
  if(s1<35 || s2<35 || s3<35)
  {
   result="Fail"; 
  }
  else
  {
   if(total>75)
   {
    result="pass with distinction class";
   }
   else
   {
    if(total>60)
    {
     result="pass with first class";
    }
    else
    {
     if(total>35)
     {
      result="pass with pass class";
     }
    }
   }
  }
  System.out.println("student result is :"+result);
 }
}