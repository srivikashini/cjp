interface inf1
{
public void method1();
}
interface inf2 extends inf1
{
public void method2();
}
public class demo implements inf2
{
public void method1()
{
System.out.println("This is method1");
}
public void method2()
{
System.out.println("This is method2");
}
public static void main(String args[])
{
inf2 obj=new demo();
obj.method2();
obj.method1();
}
}