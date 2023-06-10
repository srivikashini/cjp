class oilwellsales
{
void display()
{
System.out.println("Sales Report");
}
}
class petrol extends oilwellsales
{
void report_p()
{
System.out.println("90% profit");
}
}
class diesel extends oilwellsales
{
void report_d()
{
System.out.println("80% profit");
}
}
class salesreport
{
public static void main(String args[])
{
diesel d=new diesel();
d.display();
d.report_d();
}}