import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Code
{
String name();
String desc();
}
public class CodeTest
{
@Code(name="Test 1", desc="Testing Annotations")
public void myTestMethod(){
}
public static void main(String args[])
{
System.out.println("Hey! How are you?");
}
}