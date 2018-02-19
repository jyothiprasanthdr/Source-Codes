import java.io.*;
import java.util.*;
class DataIO
{
void writes()
{
try{
DataOutputStream dato=new DataOutputStream(new FileOutputStream("abc.txt"));
dato.writeUTF("Entered Successfully");
dato.write(123);
}
catch(Exception e)
{
System.out.println(e);
}}
void reads()
{String str;int str1;
try{
DataInputStream di=new DataInputStream(new FileInputStream("abc.txt"));
while(di.available()>0)
{

str=di.readUTF();
str1=di.read();
System.out.println(str +str1);
}} catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
DataIO a=new DataIO();
a.writes();
a.reads();
}}