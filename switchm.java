
import java.util.Scanner;
class test{
public static void display(int n){
switch(n){
		case 0:System.out.println("JANUARY");break;
		case 1:System.out.println("FEBRUARY");break;
		case 2:System.out.println("MARCH");break;
		case 3:System.out.println("APRIL");break;
		case 4:System.out.println("MAY");break;
		case 5:System.out.println("JUNE");break;
		case 6:System.out.println("JULAY");break;
                case 7:System.out.println("AUGUST");break;
		case 8:System.out.println("SPTEMBR");break;
		case 9:System.out.println("OCTOBER");break;
		case 10:System.out.println("NAVEMBER");break;
		case 11:System.out.println("DECEMBER");break;
	
                default:System.out.println("invalid");

}
}

static public void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        display(a);
}
}