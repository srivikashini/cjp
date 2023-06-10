public class Employee{
int Salary,h;
public void getInfo(int a,int b){
Salary=a;
h=b;
}
public void AddSal(){
if(Salary<500){
Salary=Salary+10;
}
}
public void AddWork(){
if(h>6){
Salary=Salary+5;
}
}
public static void main(String args[]){
Employee obj1=new Employee();
obj1.getInfo(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
obj1.AddSal();
obj1.AddWork();
System.out.println("Salary :"+obj1.Salary);
}
}