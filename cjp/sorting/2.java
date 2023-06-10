public class sort1{
public static void main(String args[]){
int count = Integer.parseInt(args[0]);
String strarry[] =new String[count];
for(int i=0;i<count;i++){
strarry[i]= args[i+1];
}
System.out.println("The input strings for sorting are : ");
for(int i=0;i<count;i++){
System.out.println(strarry[i]);
}
sort1 s1=new sort1();
s1.sort1(strarry);
}
public void sort1(String arr1[]){
int size= arr1.length;
for(int i = 0; i<size-1; i++) {
for (int j = i+1; j<arr1.length; j++){
if(arr1[i].compareTo(arr1[j])>0){
String temp = arr1[i];
arr1[i] = arr1[j];
arr1[j] = temp;
}
}
}
System.out.println("The sorted strings are:");
for(int i=0;i<size;i++){
System.out.println(arr1[i]);
}
}
}