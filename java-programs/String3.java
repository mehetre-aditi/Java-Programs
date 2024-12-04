class String3
{
 public static void main(String s[])
 {
  char[] s1={'H','e','l','l','o'};
  String s2="";
  s2=s2.copyValueOf(s1,0,5);
  System.out.println("Returned String:"+s2);
 }
}