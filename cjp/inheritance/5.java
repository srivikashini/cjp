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
class Cat extends Animal
{
void sound()
{
System.out.println("meow");
}
}
public class hierarchical
{

public static void main(String args[])
{
Cat c=new Cat();
c.sound();
c.eat();
Dog d=new Dog();
d.bark();
d.eat();
}
}