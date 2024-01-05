// intialization through referance
class Student
{
int id;
String name;
public static void main(String args[])
{
Student s1=new Student();              //s1 and s2 are the references and objects for class student
Student s2=new Student();             // we can create more than one objects for any class
s1.id=22;
s1.name="madhusudhan MD";
s2.id=27;
s2.name="deepu MD";
System.out.println(s1.id+"  "+s1.name);
System.out.println(s2.id+"  "+s2.name);
}
}