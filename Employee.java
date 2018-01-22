import java.util.Scanner;
import java.io.*;
class Employee
{
String name,post;
int nod,sal;
void getdata()
{
System.out.println("Enter the name and nod");
Scanner sc=new Scanner(System.in);
name=sc.next();
nod=sc.nextInt();
desc();
}
void desc()
{
System.out.println("Enter the post 1.manager 2.clerk 3.salesman");
Scanner scd=new Scanner(System.in);
post=scd.next();
desc(nod,post);
}
void desc(int nod,String post)
{
this.post=post;
this.nod=nod;
if(post.equals("manager"))
{
sal=500*nod;
System.out.println("Salary"+sal);
}
if(post.equals("clerk"))
{
sal=400*nod;
System.out.println("Salary"+sal);
}
if(post.equals("salesman"))
{
sal=300*nod;
System.out.println("Salary"+sal);
}
}
public static void main( String args[])
{
Employee obj=new Employee();
obj.getdata();
}
}