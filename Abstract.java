import java.util.*;
abstract class Shape
{
abstract void area( int l,int b);
}
class Rectangle extends Shape
{
void area(int l,int b)
{
System.out.println("Area of rectangle:"+(l*b));
}
}
class Triangle extends Shape
{
void area(int b,int h)
{
System.out.println("Area of triangle:"+0.5*(b*h));
}
}
class Abstract
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter l and b of rectangle:");
int l=s.nextInt();
int b=s.nextInt();
Shape ref = new Rectangle();
ref.area(l,b);
System.out.println("Enter height of triangle:");
int h=s.nextInt();
Shape ref1=new Triangle();
ref1.area(b,h);
}
}



