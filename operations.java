class raj
{
int i,j;
void sum(int x,int y)
{
i=x;
j=y;
System.out.println("sum="+(i+j));
}
void sub(int x,int y)
{
i=x;
j=y;
System.out.println("sub="+(i-j));
}
void mul(int x,int y)
{
i=x;
j=y;
System.out.println("mul="+(i*j));
}
void div(int x,int y)
{
i=x;
j=y;
System.out.println("div="+(i/j));
}
}
 
class madhu
{
public static void main(String args[]){
raj r=new raj();
r.sum(4,7);
r.sub(20,13);
r.mul(5,4);
r.div(60,5);
}
}