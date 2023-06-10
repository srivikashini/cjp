public class student{
String name,status;
int rollno,m1,m2,m3,total;
public student(String n,int r){
name=n;
rollno=r;
}
public void result(int a,int b,int c){
m1=a;
m2=b;
m3=c;
}
public void calculate(){
total=(m1+m2+m3);
System.out.println("Total : "+total);
if(m1>=50&&m2>=50&&m3>=50){
status = "Pass";
}
else{
status = "Fail";
}
System.out.println("result : "+status);
}
public static void main(String args[]){
student obj1=new student(args[0],Integer.parseInt(args[1]));
System.out.println("Name : "+obj1.name);
System.out.println("Roll number : "+obj1.rollno);
obj1.result(Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]));
obj1.calculate();
}
}