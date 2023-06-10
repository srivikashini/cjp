class Animal{
	void move(){
		System.out.println("Animals can move.");
	}
}
class Tiger extends Animal{
	void move(){
		System.out.println("Tiger can walk as well as run.");
	}
}
class Cub extends Tiger{
	void move(){
		System.out.println("Cub can walk.");
	}
}
class Polymorphism{
    public static void main(String[] args) {
		Animal A = new Animal();
		A.move();
		A = new Tiger();
		A.move();
		A = new Cub();
		A.move();
    }
}
