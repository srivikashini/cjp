public class Exception{
public static void main(String args[]){
int a,b,c;
try{
a = 0;
b = 10;
c = b/a;
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