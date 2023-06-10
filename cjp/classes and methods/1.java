public class student{
String name;
int rollno;
public student(String n, int r){
name=n;
rollno=r;
}
public static void main(String args[]){
student obj1=new student("John",2);
System.out.println("My name is"+obj1.name);
System.out.println("My roll number is"+obj1.rollno);
}
}