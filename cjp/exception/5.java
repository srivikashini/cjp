public class Exception{
public static void main(String args[]){
try{
int a[]=new int[10];
System.out.println(a[20]);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
catch(NullPointerException e)
{
System.out.println("NullPointerException Caught");
}
System.out.println("After exception is handled");
}
}