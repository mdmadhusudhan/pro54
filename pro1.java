class ai
{
private int age;
public void set(int age){
if(age<0)this.age=0;
else
this.age=age;
}
public int getAge(){
return this.age;
}
}
class hello
{
public static void main(String args[]){
System.out.println("good morning");
ai ob=new ai();
//ob.set(10);
ob.set(-10);
System.out.println("X="+ob.getAge());
}
}