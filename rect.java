
class Rectangle 
{
int length;
int breadth;
void set(int x, int y)
{
length=x;
breadth=y;
}
void area()
{
System.out.println(length*breadth);
}
}
class rain
{
public static void main(String args[])
{
Rectangle r1=new Rectangle ();
Rectangle r2=new Rectangle ();
Rectangle r3=new Rectangle ();
r1.set(6,8);
r2.set(34,6);
r3.set(86,74);
r1.area();
r2.area();
r3.area();
}
}
