class Name
{
 String FirstName;
 String MidName;
 String LastName;
 Name(String fn,String mn,String ln)
 {
  FirstName=fn;
  MidName=mn;
  LastName=ln;
 }
}
class Address
{
 String bname,area;
 String pin;
 String dist;
 String state;
 String country;
 Address(String bn,String ar,String p,String di,String st,String co)
 {
  bname=bn;
  area=ar;
  pin=p;
  dist=di;
  state=st;
  country=co;
 }
}
class Emp
{
 int age;
 Name n;
 Address ar;
 public void display(int a,Name n1,Address a1)
 {
  n=n1;
  ar=a1;
  age=a;
  System.out.print("Employees Full Name:\n");
  System.out.println(n.FirstName+"\t"+n.MidName+"\t"+n.LastName+"\n"+"Age="+age);
  System.out.println("Address="+a1.bname+","+a1.area);
  System.out.println("Pin Code="+a1.pin);
  System.out.println("District="+a1.dist);
  System.out.println("State="+a1.state);
  System.out.println("Country="+a1.country);
 }
}
class Relation
{
 public static void main(String args[])
 {
  Emp e=new Emp();
  Name n1=new Name("Aditi","Somnath","Mehetre");
  Address a1=new Address("Destiny","Pimpale Gurav","422201","Pune","Maharashtra","India");
  e.display(18,n1,a1);
 }
}