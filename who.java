import java.util.Scanner;
class test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("INPUT");
char c=sc.next().charAt(0);
System.out.println("OUTPUT");
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))System.out.println("YES");
else
System.out.println("NO");
}
}
