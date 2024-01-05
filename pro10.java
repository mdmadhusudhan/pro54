import java.io.*;
class buff{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter your name");
String name=br.readLine();
System.out.println("Welcome     "+name);

}
}