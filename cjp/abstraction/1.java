abstract class Animal //abstarct class
{
public abstract void animalsound(); // abstract method(does not have body)
public void sleep() //normal method
{
System.out.println("Sleeping");

}

}
class cat extends Animal
{
public void animalsound()
{
// body of the abstract class
System.out.println("The cat says: Meow meow");
}
}
public class abstractexample
{
public static void main(String args[])
{
cat c=new cat();
c.animalsound();

c.sleep();
}
}