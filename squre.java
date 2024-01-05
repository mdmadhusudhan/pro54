
class squre
{
int side;

void set(int x)
{
side=x;
}
void area()
{
System.out.println(side*side);
}
}
class smile
{
public static void main(String args[])
{
squre s1=new squre ();
squre s2=new squre ();
squre s3=new squre ();
s1.set(6);
s2.set(5);
s3.set(13);
s1.area();
s2.area();
s3.area();
}
}
