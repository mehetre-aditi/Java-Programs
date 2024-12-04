interface Polygon
{
 void getArea();
 default void getSides()
 {
  System.out.println("I can get sides of a polygon");
 }
 public static void sayHi()
 {
  System.out.println("Hi guys");
 }
}
class Rectangle implements Polygon
{
 public void getArea()
 {
  int length=6;
  int breadth=5;
  int area=length*breadth;
  System.out.println("The area of the Reactangle is "+area);
  Polygon.sayHi();
 }
 default void getSides()
 {
  System.out.println("I have 4 sides");
 }
}
class Square implements Polygon
{
 public void getArea()
 {
  int length=6;
  int area=length*length;
  System.out.println("The area of the Squaree is "+area);
  Polygon.sayHi();
 }
}
class DefaultMeth
{
 public static void main(String s[])
 {
  Rectangle r1=new Rectangle();
  r1.getArea();
  r1.getSides();
  Square s1=new Square();
  s1.getArea();
  s1.getSides();
  Polygon.sayHi();
 }
}