import java.io.*;
import java.util.*;
class test{
static public void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
if (a==0)System.out.println("SUNDAY");
else if (a==1)System.out.println("MODAY");
else if (a==2)System.out.println("TUESDAY");
else if (a==3)System.out.println("WEDNESAY");
else if (a==4)System.out.println("THRUSDAY");
else if (a==5)System.out.println("FRIDAY");
else if (a==6)System.out.println("SATURDAY");
else
System.out.println("invalid enter b/t 0-6");

}
}