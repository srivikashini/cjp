import java.io.*;
import java.util.*;
class baseclass
{
String name, regno ,dept;
int year;
void getdetails()
{
Scanner SC=new Scanner(System.in);
System.out.print(“Enter Name: “);
name=SC.nextLine();
System.out.print(“Enter Roll Number: “);
regno=SC.nextLine();
System.out.print(“Enter Department: “);
dept=SC.nextLine();
System.out.print(“Enter year of study: “);
year=SC.nextInt();
}
}
class book_detail extends baseclass
{
String book_id,title,author;
void getbook()
{
Scanner SC=new Scanner(System.in);
System.out.print(“Enter book_id: “);
book_id=SC.nextLine();
System.out.print(“Enter title: “);
title=SC.nextLine();
System.out.print(“Enter author: “);
author=SC.nextLine();
}
}
public class lending_details extends book_detail
{
public static void main(String args[])
{
lending_details obj = new lending_details();
obj.getdetails();
obj.getbook();
System.out.println(“\n\n\n\t\t\tDETAILS “);
System.out.println(“quot;Name: “+ obj.name);
System.out.println(“Reg no.: “+ obj.regno);
System.out.println(“Year: “+ obj.year);
System.out.println(“Department: “+ obj.dept);
System.out.println(“Book Title: “+ obj.title);
System.out.println(“Author: “+ obj.author);
}
}