class Animal //Base classor super class
{
void eat()
{
System.out.println("Eating");

}
}
class Dog extends Animal //Deriver class or sub class
{
void bark()
{
System.out.println("Barking");

}
}

class puppy extends Dog
{
void sleep()
{
System.out.println("Sleeping");
}
}
public class multilevel
{
public static void main(String args[])
{
puppy p=new puppy();
p.sleep();
p.bark();
p.eat();

}
}