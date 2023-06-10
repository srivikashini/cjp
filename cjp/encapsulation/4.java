package encapsulationTest; 
public class Number
{ 
   private int y; 
public int get() { 
    return y; 
}  
public void set(int y) { 
   this.y = y; 
 } 
} 
public class Encaptest
{ 
public static void main(String[] args)
{  
 Number n = new number(); 
   n.set(6); 
  int num = n.get(); 
  System.out.println(num); 
  } 
}