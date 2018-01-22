import java.util.*;
import java.io.*;
import java.util.ArrayList;
class Test
{ int id,phno;
String name,address;
int m1,m2,m3;
Scanner a=new Scanner(System.in);
Test()
{ getdet();
putdet();
}
void getdet()
{
	System.out.println("\n Enter the name,id,addredss,phno,marks");
	name=a.next();
	id=a.nextInt();
	address=a.next();
	phno=a.nextInt();
	m1=a.nextInt();
	m2=a.nextInt();
	m3=a.nextInt();
}
void putdet()
{
	System.out.println("\nName"+" "+name);
	System.out.println("\nId"+" "+id);
	System.out.println("\nAddress"+" "+address);
	System.out.println("\nPhno"+" "+phno);
	System.out.println("\nM1"+" "+m1);
	System.out.println("\nM2"+" "+m2);
	System.out.println("\nM3"+" "+m3);
}
}
class Student extends Test
{ Student()
  { 
    super();
   }
void total()
{
int total;
total=m1+m2+m3;
System.out.println("ToTal"+total);
}
}
class Stud
{
public static void main(String args[])
{
Student a=new Student();
a.total();
}
}
