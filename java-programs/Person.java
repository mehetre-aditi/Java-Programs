class Person
{
 int pid;
 String pname;
 int age;
 String gender;
 Person()
 {
  this.pid=pid;
  this.pname=pname;
  this.age=age;
  this.gender=gender;
 }
 Person(int pid,String pname,int age,String gender)
 {
  this.pid=pid;
  this.pname=pname;
  this.age=age;
  this.gender=gender;
 }
 void display()
 {
  System.out.println("Person ID : "+pid+"\tPerson Name : "+pname+"\tAge : "+age+"\tGender : "+gender);
 }
 public static void main(String args[])
 {
  Person p1=new Person(1,"Om",20,"Male");
  Person p2=new Person(2,"Jay",20,"Male");
  Person p3=new Person(3,"Deva",20,"Male");
  Person p4=new Person(4,"Ram",20,"Male");
  Person p5=new Person(5,"Shreyash",20,"Male");
  p1.display();
  p2.display();
  p3.display();
  p4.display();
  p5.display();
 }
}
  
 
