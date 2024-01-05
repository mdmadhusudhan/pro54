class circle
{
int radi;
void set(int x)
{
radi=x;
}
void area()
{
System.out.println(3.14*(radi*radi));
}
void para()
{
System.out.println(2*3.14*radi);
}
}
class me
{
public static void main(String args[])
{
circle c1=new circle();
circle c2=new circle();
circle c3=new circle();
c1.set(6);
c2.set(7);
c3.set(9);
c1.area();
c2.area();
c3.area();
c1.para();
c2.para();
c3.para();
}
}