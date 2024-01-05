 class Reverse
{  
public static void reve(int number)   
{  
if (number < 10)   
{   
System.out.println(number);  
return;  
}  
else   
{  
System.out.print(number % 10);  
reve(number/10);  
}  
}  
public static void main(String args[])  
{  
int num = 135;  
System.out.print("The reverse of the given number is: ");  
reve(num);  
}  
}  