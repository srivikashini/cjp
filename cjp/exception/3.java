public class Exception{
public static void main(String args[]){
String ptr = null;
try{
if (ptr.equals("gfg"))
System.out.print("Same");
}
catch(NullPointerException e)
{
System.out.println("NullPointerException Caught");
}
System.out.println("After exception is handled");
}
}