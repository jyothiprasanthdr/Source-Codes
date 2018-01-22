import java.io.*;
import java.util.Scanner;
class Emp
{
String name,post;
int nod,salary;
void getdata()
{System.out.println("enter the name nod");
Scanner sc=new Scanner(System.in);
name=sc.next();
nod=sc.nextInt();
des();
}
void des()
{
System.out.println("post 1.salesman 2.clerk 3.manager");
Scanner m=new Scanner(System.in);
post=m.next();
des(post,nod);
}
void des(String post,int nod)
{
this.nod=nod;
this.post=post;
if(post.equals("manager"))
salary=(nod*1000);
if(post.equals("salesmen"))
salary=(nod*500);
if(post.equals("clerk"))
salary=(nod*300);
}
void display()
{
System.out.println("name"+name+"post"+post+"salary"+salary);
}
public static void main(String args[])
{
Emp obj=new Emp();
obj.getdata();
obj.display();
}}

