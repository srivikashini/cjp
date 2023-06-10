class Shape{
	void area(){
		System.out.println("Formula for areas.");
	}
}
class Square extends Shape{
	void area(){
		System.out.println("Area of square : a * a");
	}
}
class Rectangle extends Shape{
	void area(){
		System.out.println("Area of rectangle : 2 * (a + b)");
	}
}
class Circle extends Shape{
	void area(){
		System.out.println("Area of circle : pi * r * r");
	}
}
class Polymorphism{
    public static void main(String[] args) {
    	Shape S = new Shape();
    	S.area();
    	S = new Square();
    	S.area();
    	S = new Rectangle();
    	S.area();
    	S = new Circle();
    	S.area();
    }
}
