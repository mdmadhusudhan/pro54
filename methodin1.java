//insilization through method
class Employ
{
int id;
String name;
String dpt;
void set(int x,String n,String m)
{
id=x;
name=n;
dpt=m;
}
void display()
{
System.out.println(id+"  "+name+" "+dpt);
}
}
class remo
{
public static void main(String args[]){
Employ e1=new Employ();
Employ e2=new Employ(); 
Employ e3=new Employ(); 
e1.set(22, "madhu","AI&DS");
e2.set(27,"deepu","DS");
e3.set(10,"RAJ","PET");
e1.display();
e2.display();
e3.display();
}
}