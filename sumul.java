import java.util.Scanner;
class Iam
{
public static int add(int a,int b)
{
return a+b;
}
public static void table(int x){
int i;
for(i=0;i<=10;i++){System.out.println(x+"*"+i+"="+(x*i));}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int res=Iam.add(n1,n2);
System.out.println(res);
Iam.table(n1);
Iam.table(n2);
}
}