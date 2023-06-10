class Animal
{
protected String type;
private String color;
public void eat()
{

System.out.println("Eating");
}
public void sleep()
{
System.out.println("Sleeping");

}
public String getcolor()
{
return color;
}
public void setcolor(String col)
{
color=col;
}
}
class Dog extends Animal
{
public void displayinfo(String c)
{
System.out.println("Iam a "+ type);
System.out.println("My color is "+ c);
}
public void bark()
{

System.out.println("I can bark");
}
}
public class Main
{
public static void main(String args[])
{
Dog d1=new Dog();
d1.eat();
d1.sleep();
d1.bark();

d1.type="Mammal";
d1.setcolor("brown");
d1.displayinfo(d1.getcolor());
}
}