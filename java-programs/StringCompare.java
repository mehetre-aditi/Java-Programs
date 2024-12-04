class StringCompare
{
 public static void main(String args [])
 {
  String s1,s2,s3,s4,s5,s6,s7;
  char name[]={'R','a','m','a','n'};
  s1=new String();
  s2=new String(name);
  s3=new String(name,2,3);
  s4=new String(s2);
  s5="Raman";
  s6="Raman"; 
  s7=s2;
  System.out.println("\ns1 = "+s1); 
  System.out.println("\ns2 = "+s2); 
  System.out.println("\ns3 = "+s3); 
  System.out.println("\ns4 = "+s4); 
  System.out.println("\ns5 = "+s5); 
  System.out.println("\ns6 = "+s6); 
  System.out.println("\ns7 = "+s7);
  System.out.println("\n is(s2==s4)?"+(s2==s4));
  System.out.println("\n is(s2.equals(s4))?:"+s2.equals(s4));
  System.out.println("\n is(s5.equals(s4))?:"+s5.equals(s4));
  System.out.println("\n is(s5==s4)?"+(s5==s4));
  System.out.println("\n is(s5.equals(s6))?:"+s5.equals(s6));
  System.out.println("\n is(s5==s6)?"+(s5==s6));
  System.out.println("\n is(s2.equals(s7))?:"+s5.equals(s7));
  System.out.println("\n is(s4==s7)?"+(s5==s7));
 }
}
     