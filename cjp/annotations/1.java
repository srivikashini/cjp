import java.util.*;
class Engineer{
public void Run(){
System.out.println("Invents something new");
}}
class Inventor extends Engineer{
@Override
public void Run(){
System.out.println("Invents something new");
}}
public class OverrideAnnotationTest{
public static void main(String args[]){
System.out.println("@Override Example");
Engineer A=new Engineer();
A.Run();