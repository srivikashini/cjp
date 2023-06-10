class Shape{
	void area(){
		System.out.println("Area of various shapes are calculated here.");
	}
}
class Square extends Shape{
	int a;
	Square(int side){
		this.a = side;
	}
	void area(){
		System.out.println("Side of square is : "+a);
		System.out.println("Area of square is : "+(a*a)+"\n");
	}
}
class Circle extends Shape{
	int r;
	Circle(int a){
		this.r = a;
	}
	void area(){
		System.out.println("Radius of circle is : "+r);
		System.out.println("Area of circle is : "+(3.14*r*r)+"\n");
	}
}
class Rectangle extends Shape{
	int l, b;
	Rectangle(int w, int h){
		this.l = w;
		this.b = h;
	}
	void area(){
		System.out.println("Sides of rectangle are : "+l+", "+b);
		System.out.println("Area of rectangle is : "+(2*(l + b))+"\n");
	}
}
class Polymorphism{
    public static void main(String[] args) {
		Shape [] arr = {
			new Square(10), new Circle(15), new Rectangle(10, 15)
		};
		for(int i=0; i<arr.length; i++){
			arr[i].area();
		}
    }
}
