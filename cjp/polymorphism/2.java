class Livingthings {
  public void live() {
    System.out.print("live on ");
  }
}
class Animals extends Livingthings {
  public void live() {
    System.out.println("water, air, and land.");
  }
}
class Humanbeing extends Livingthings {
  public void live() {
    System.out.println("land.");
  }
}
class Plants extends Livingthings {
  public void live() {
    System.out.println("water and land.");
  }
}
class Polymorphism {
  public static void main(String[] args) {
    Livingthings LT = new Livingthings();
    Livingthings LT1;
    LT1 = new Animals();
    System.out.print("Animals ");
    LT.live();
    LT1.live();
    LT1 = new Humanbeing();
    System.out.print("Human beings ");
    LT.live();
    LT1.live();
    LT1 = new Plants();
    System.out.print("Plants ");
    LT.live();
    LT1.live();
  }
}
