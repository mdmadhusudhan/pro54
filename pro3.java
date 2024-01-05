class cool
{

String college_name;
String college_address;
private int start;
private int end;
private int id;
String name;
String course_name;
String aaddar_no;
public void set(int id,int a,int b){
this.id=id;
start=a;
end=b;
}
public void set0(String name,String n,String m,String o,String p){
this.name=name;
college_name=n;
college_address=m;
course_name=o;
aaddar_no=p;
}

public String get1(){
return college_name;
}
public String get2(){
return college_address;
}
public int get3(){
return start;
}
public int get4(){
return end;
}
public int get5(){
return id;
}
public String get6(){
return name;
}
public String get7(){
return course_name;
}
public String get8(){
return aaddar_no;
}
}
class hello
{
public static void main(String args[]){
System.out.println("good morning");
cool g=new cool();
g.set(27748,2022,2026);
g.set0("Madhusudhan","MOTHER THERESA INSTITUTE OF ENGINEERING AND TECHNOLOGY","melumai_PALAMANER-517408","AI&DS","567622109796");
System.out.println(g.get1()+"\n "+"\t"+g.get2()+"\n"+"\t"+" "+g.get3()+"-"+g.get4()+"\n"+"\t"+"   "+g.get5()+"\n"+"\t"+g.get6()+"\n"+"\t"+"   "+g.get7()+"\n"+"\t"+g.get8());
}
}