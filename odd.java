import java.util.Scanner; 
class a{
public static void Test(int a){
if(a%2==0)System.out.println("EVEN");
else
System.out.println("ODD");}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("INPUT:");
int n=sc.nextInt();
System.out.println("OUTPUT:");
a.Test(n);

}
}



