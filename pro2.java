class good
{
private int id;
String name;
public void set(int id,String name){
this.id=id;
this.name=name;
}
public int get(){
return id;
}
public String geta(){
return name;
}
}
class hello
{
public static void main(String args[]){
System.out.println("good morning");
good g=new good();
g.set(354,"krishna");
System.out.println("id:"+g.get()+" \n"+"name:"+g.geta());
}
}