public class main{
public static void main(String args[]){
try{
try{
System.out.println("going to divide");
int b =39/0;
}
catch(ArithmeticException e){System.out.println(e);}
try{
int a[]=new int[5];
a[5]=4;
}
catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
try{
String ptr = null;
if (ptr.equals("gfg"))
System.out.print("Same"); // exception
}
catch(NullPointerException e) {
System.out.println(e);}}
catch(Exception e){
System.out.print("handeled");
}}}