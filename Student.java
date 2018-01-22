import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
class StudentTest
{
String name,address;
int id,i,j=10;
Scanner a=new Scanner(System.in);
String c[]=new String[4];
ArrayList<String> b = new ArrayList<String>();
float e[]=new float[4];
void gdet()
{	
	System.out.println("enter the name");
	name=a.next();
	System.out.println("Enter ur id");
	id=a.nextInt();
	calculation();
	System.out.println("Enter ur Grades of maths of crdt 4,phy of crdt 3,che crdt 2,cselab crdt 1");
	for(i=0;i<4;i++)
	{
	 c[i]=a.next();
	}
}
void pdet()
{
	System.out.println("NAME"+name);
	System.out.println("ID"+id);
	
}
void gpa()
{ int k=4;
float su=0,gpa;
for(i=0;i<4;i++)
{ if(c[i].equals(b.get(0)))
   {e[i]=10*k;
    k--;
    } 
   if(c[i].equals(b.get(1)))
   {e[i]=9*k; 
    k--; 
    } 
   if(c[i].equals(b.get(2)))
   {e[i]=8*k;
    k--;
   } 
   if(c[i].equals(b.get(3)))
   {e[i]=7*k;
    k--;
}    }
for(i=0;i<4;i++)
 {  //System.out.println(e[i]);
    su=su+e[i];}
gpa=su/10;
System.out.println("GPA of"+" "+name+" "+gpa);
}
void calculation()
{  
b.add("A");
b.add("B");
b.add("C");
b.add("D");
for(i=0;i<4;i++)
	{
	 System.out.println(b.get(i)+" "+(j--));
	}
}}
class Student
{
public static void main(String args[])
{  StudentTest d=new StudentTest();
d.gdet();
d.pdet();
d.gpa();
}
}