 import java.util.Scanner;
class lion
{
public static double div(int a,int b)
{
if (b==0){System.out.println("divisable by 0 error");}
double c=(double)a/(double)b;           //type casting
return c;
}
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1:");
int num1=sc.nextInt();
System.out.println("Enter the number2:");
int num2=sc.nextInt();
System.out.println(num1+"+"+num2+"="+add(num1,num2));
System.out.println(num1+"/"+num2+"="+div(num1,num2));
}
}