class CompileTime {
  static int perimeter(int a) {
    return 4 * a;
  }
  static int perimeter(int l, int b) {
    return 2 * (l + b);
  }
}
class Polymorphism {
  public static void main(String[] args) {
    System.out.println("Side of square : 4\nPerimeter of square will be : " + Compiletime.perimeter(4) + "\n");
    System.out.println("Sides of rectangle are : 10, 13\nPerimeter of rectangle will be : " + Compiletime.perimeter(10, 13));
  }
}
