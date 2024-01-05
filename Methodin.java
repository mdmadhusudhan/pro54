//insilization through method
class Student
{
int id;
String name;
void set(int x,String n)
{
id=x;
name=n;
}
void display()
{
System.out.println(id+"  "+name);
}
}
class Demo
{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student(); 
s1.set(22, "madhu");
s2.set(27,"deepu");
s1.display();
s2.display();
}
}