public class Exception{
public static void main(String args[]){
try{
int a[]=new int[10];
System.out.println(a[20]);// exception
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception --> "+e);
}
System.out.println("After exception is handled");
}}