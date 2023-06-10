import java.util.Scanner;
class bank {
private String accno;
private String name;
private long balance;
Scanner a = new Scanner(System.in);
void openAcnt() {
System.out.print("Enter Account No: ");
accno = a.next();
System.out.print("Enter Name: ");
name = a.next();
System.out.print("Enter Balance: ");
balance = a.nextLong();
}
void showAcnt() {
System.out.println(accno + "," + name + "," + balance);
}
void deposit() {
long amt;
System.out.println("Enter Deposit Amount: ");
amt = a.nextLong();
balance = balance + amt;
}
void withdrawal() {
long amt;
System.out.println("Enter Withdrawal Amount : ");

amt = a.nextLong();
if (balance >= amt) {
balance = balance - amt;
} else {
System.out.println("Low Balance..Transaction Failed..");
}
}
boolean search(String acn) {
if (accno.equals(acn)) {
showAcnt();
return (true);
}
return (false);
}
}
public class Main {
public static void main(String arg[]) {
Scanner a = new Scanner(System.in);
System.out.print("Number of Customers : ");
int n = a.nextInt();
bank C[] = new bank[n];
for (int i = 0; i < C.length; i++) {
C[i] = new bank();
C[i].openAcnt();
}
int ch;
do {
System.out.println("Main Menu\n1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n
5.Exit ");
System.out.println("Your Choice :"); ch = a.nextInt();
switch (ch) {
case 1:
for (int i = 0; i < C.length; i++) {
C[i].showAcnt();
}
break;
case 2:
System.out.print("Enter the Account to be searched: ");
String acn = a.next();
boolean found = false;
for (int i = 0; i < C.length; i++) {
found = C[i].search(acn);
if (found) {
break;
}
}
if (!found) {

System.out.println("Search Failed..Account does not exist..");
}
break;
case 3:
System.out.print("Enter Account No : ");
acn = a.next();
found = false;
for (int i = 0; i < C.length; i++) {
found = C[i].search(acn);
if (found) {
C[i].deposit();
break;
}
}
if (!found) {
System.out.println("Search Failed..Account does not Exist..");
}
break;
case 4:
System.out.print("Enter Account No : ");
acn = a.next();
found = false;
for (int i = 0; i < C.length; i++) {
found = C[i].search(acn);
if (found) {
C[i].withdrawal();
break;
}
}
if (!found) {
System.out.println("Search Failed..Account does not Exist..");
}
break;
case 5:
System.out.println("Thank you");
break;
}
}
while (ch != 5);
}
}