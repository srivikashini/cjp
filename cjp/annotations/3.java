import java.util.*;
class Simple
{
void firstmsg()
{
System.out.println("Hey!");
}
@Deprecated
void secondmsg()
{
System.out.println("How are you?");
}
}
public class DeprecatedAnnotation{
public static void main(String args[])
{
Simple A=new Simple();
A.secondmsg();
}
}