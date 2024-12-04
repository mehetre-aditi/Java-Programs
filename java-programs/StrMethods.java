class StrMethods
{
 public static void main(String args[])
 {
  String s1,s2;
  s1=new String("Aditi");
  s2="Akshada";
  System.out.println("First String: "+s1);
  System.out.println("Second String: "+s2);

  System.out.println("Length of first string : "+s1.length());
  System.out.println("Length of second string : "+s2.length());

  char ind1=s1.charAt(3);
  System.out.println("Character at index 3 is : "+ind1);

  int ind2=s2.codePointAt(2);
  System.out.println("Unicode of char at index 3 is : "+ind2);

  int diff=s1.compareTo(s2);
  System.out.println("Difference between chars of string 1 and 2 :"+diff);
 
  String cnct=s1.concat(s2);
  System.out.println("Concatnation of string 1 and 2 is :"+cnct);
 }
}