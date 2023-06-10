interface myinterface
{
public void method1();
public void method2();

}
public class interfacedemo implements myinterface
{

public void method1()
{
System.out.println("Implementation of method1");

}
public void method2()
{
System.out.println("Implementation of method2");

}
public static void main(String args[])
{
myinterface obj=new interfacedemo();
obj.method1();
obj.method2();
}
}