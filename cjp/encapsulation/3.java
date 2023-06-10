package encapsulationTest; 
public class Student 
{ 
  private String stdName;
  private int stdRollNo; 
  private int stdId;  
  public String getStdName()
  { 
   return stdName; 
  } 
public int getStdRollNo()
{ 
  return stdRollNo; 
} 
public int getStdId()
{ 
  return stdId: 
} 
public void setStdName(String name)
{ 
  stdName = name; 
} 
public void setStdRollNo(int rollNo)
{ 
  stdRollNo = rollNo; 
} 
public void setId(int id)
{ 
  stdId = id; 
 } 
}
public class EncapTest 
{ 
public static void main(String[][] args)
{ 
 Student obj = new Student(); // Here, obj is reference variable of class Student and pointing to objects of class Student. 
   obj.setStdName("Kiran"); 
   obj.setStdRollNo(4); 
   obj.setStdId(12345); 
   System.out.println("Student's Name: " +obj.getStdName()); 
   System.out.println("Student's Roll no.: " +obj.getStdRollNo()); 
   System.out.println("Student's Id: " +obj.getStdId()); 
  } 
}