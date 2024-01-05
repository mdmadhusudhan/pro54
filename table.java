import java.util.Scanner;
class good
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int i;
for(i=1;i<=10;i++)
{
System.out.println(n1+"*"+i+"="+(n1*i));
}
for(i=1;i<=10;i++)
{
System.out.println(n2+"*"+i+"="+(n2*i));
}

for(i=1;i<=10;i++)
{
System.out.println(n3+"*"+i+"="+(n3*i));
}
}
}