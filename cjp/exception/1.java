public class Exception{
public static void main(String args[]){
int a,b,c;
try{
a = 0;
b = 10;
c = b/a;// exception
}
catch(ArithmeticException e){
System.out.println("Divided by zero");
}
System.out.println("After exception is handled");
}}