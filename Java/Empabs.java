import java.util.*;
import java.io.*;
import java.lang.*;

abstract class Employee
{
int empid,age;
String name,destn;
Scanner sc=new Scanner(System.in);
abstract void getdata();
abstract void putdata();
}
class Dwages extends Employee
{ 
void show()
{
System.out.println("------Daily Wages------");
}
void des() 
{
int sal,nop,nod,cl,noa; 
System.out.println("Enter ur designation");

System.out.println("1.clerk 2.writer");
destn=sc.next();
System.out.println("Enter the no of days held and casual leave and days absent");
nod=sc.nextInt();
cl=sc.nextInt();
noa=sc.nextInt();
nop=nod-cl-noa;
System.out.println("No of days worked totally"+nop);
if(destn.equals("clerk"))
{ sal=400*nop;
System.out.println("The salary of clerk is"+sal);
}
if(destn.equals("writer"))
{ sal=500*nop;
System.out.println("The salary of writer is"+sal);
}}

void getdata()
{
System.out.println("Enter the name,empid,age");
name=sc.next();
empid=sc.nextInt();
age=sc.nextInt();
}
void putdata()
{
System.out.println("Name:"+name);
System.out.println("Empid"+empid);
System.out.println("Age"+age);
}}
class Mwages extends Employee
{
void show()
{
System.out.println("------Monthly Wages------");
}
void getdata()
{
System.out.println("Enter the name,empid,age");
name=sc.next();
empid=sc.nextInt();
age=sc.nextInt();
}
void putdata()
{
System.out.println("Name:"+name);
System.out.println("Empid"+empid);
System.out.println("Age"+age);
}
void des() throws IOException
{
int m,total,sal,nod,noa; 
System.out.println("Enter ur designation");
System.out.println("1.manager 2.a_manager ");
destn=sc.next();
System.out.println("enter the no of days held in month and taken absent");
nod=sc.nextInt();
noa=sc.nextInt();

if(destn.equals("manager"))
{sal=50000;
m=sal/nod*noa;
total=50000-m;
System.out.println("The salary of the manager is"+total);
}
if(destn.equals("a_manager"))
{sal=40000;
m=sal/nod*noa;
total=40000-m;
System.out.println("The salary of the a_manager is"+total);
}
throw new IOException("Exception handled");
}
}
class Empabs
{
public static void main(String args[])
{
Dwages p=new Dwages();
p.show();
p.getdata();
p.putdata();
p.des();
Mwages q=new Mwages();
q.show();
q.getdata();
q.putdata();
try
{
q.des();}

catch(Exception e)
{
System.out.println(e);
}

}}
