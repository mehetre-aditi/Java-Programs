interface One
{
 void show();
}
class Sample
{
 int x,y;
 void getdata(int m,int n)
 {
  x=m;
  y=n;
 }
 void setdata()
 {
  System.out.println("vlaue of x ="+x+"\nvalue of y="+y);
 }
}
class MultipleInheri extends Sample implements One
{
 int z;
 public void show()
 {
  z=x+y;
  System.out.println("Addition is="+z);
 }
 public static void main(String s[])
 {
  MultipleInheri t=new MultipleInheri();
  t.getdata(12,34);
  t.setdata();
  t.show();
 }
} 