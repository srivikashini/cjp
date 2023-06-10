import java.util.*;
public class SuppressWarnnings
{
@SuppressWarnings("Error")
public static void main(String[] args)
{
ArrayList a=new ArrayList();
a.add("ABC");
a.add("DEF");
a.add("GHI");
for(Object c:a)
System.out.println(c);
}}