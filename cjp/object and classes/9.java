import java.io.*;
public class elect{
public static void main(String arg[]){
int i, num=0, ctr=1;
int a[]=new int[5];
DataInputStream ins=new DataInputStream(System.in);
do{
try{
System.out.print("Enter candidate no.");
num=Integer.parseInt(ins.readLine());
}
catch(IOException e)
{}
for(i=0; i<5; i++){
if(num==(i+1))
a[i]++;
}
ctr++;

}
while(ctr<=10);

System.out.println("");

for(i=0; i<5; i++)
System.out.println("The no. of votes for canadidate"+(i+1)+"are:"+a[i]);
}
}