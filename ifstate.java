import java.util.Scanner;
class ifelseif{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(j==0){System.out.println("divisable by zero error");}
else 
System.out.println(i+" "+"divisable by"+" "+ j+ " "+"is"+" "+ i/j);
i=i+j;
}
}
