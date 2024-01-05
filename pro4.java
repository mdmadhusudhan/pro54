class rose
{
String name;
String subject;
String std;
String div;
String rollnumber;
String college;
public void set(String a,String b ,String c,String d, String e,String f){
name=a;
subject=b;
std=c;
div=d;
rollnumber=e;
college=f;
}
public String get(){return name;}
public String get1(){return subject;}
public String get2(){return std;}
public String get3(){return div;}
public String get4(){return rollnumber;}
public String get5(){return college;}
}
class emog{
public static void main(String args[]){
rose r=new rose();
r.set("Madhusudhan","javafullstack","Btech","AI&DS","22HR1A3022","MTIEAT");
System.out.println("Name:"+r.get()+"\t"+"Subject:"+r.get1()+"\n"+"STD:"+r.get2()+"\t"+"DIV:"+r.get3()+"\t"+"Rollnumber:"+r.get4()+"\t"+"College:"+r.get5());
}
}