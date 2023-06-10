import java.io. *;
class customer {
private int accno;
private String name;
private long balance;
customer(int acc, String n, long b){
accno=acc;
name=n;
balance=b;
}
void eligible(){
System.out.println("Account Number: " +accno);
System.out.println("Name: " +name);
System.out.println("Balance: "+balance);
if(balance>=5000){
System.out.println("Eligible for loan processing");
}
else{
System.out.println("Not Eligible for loan processing");
}}
}
public class ExBank{

public static void main(String arg[]){
customer c1=new customer(8576,"Jones",4200);
customer c2=new customer(3658,"Ben",37000);
c1.eligible();
c2.eligible();
}
}