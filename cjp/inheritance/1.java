import java.util.Scanner;
class employee{
private String employeid;
private String empname;
private int basicsalary;
private float incometax,netsalary;
public void read(){
Scanner scan= new Scanner(System.in);
System.out.println("Enter the employee id:");
employeid=scan.next();
System.out.println("Enter the employee name:");
empname=scan.next();
System.out.println("Enter the basic salary of an employee:");
basicsalary=scan.nextInt();
calculate();
}
public void calculate() {
incometax=(30*basicsalary)/100;
netsalary= basicsalary-incometax;
}
public void display(){
System.out.println("Employeeid : "+employeid+"\n"+"Employename : "+empname+"\n"+"Employee basic
salary : "+basicsalary+"\n"+"Incometax : "+incometax);
System.out.println("netsalary : "+netsalary);
}

}
public class main {
public static void main(String args[]){
employee employeobj=new employee();
employeobj.read();
employeobj.display();
}
}