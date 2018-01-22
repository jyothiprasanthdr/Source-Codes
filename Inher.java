import java.util.*;
class Person
{ int id,age;
String name,profn;
final String clgname="Madras Institute of Technology";
Scanner sc=new Scanner(System.in);
void coll()
{
System.out.println("College Name"+" "+clgname);
}
void getdet()
{
System.out.println("Enter the name and id");
name=sc.next();
id=sc.nextInt();
System.out.println("enter ur age");
age=sc.nextInt();
System.out.println("Ur profession is");
profn=sc.next();
}
void putdt()
{ 
  coll();
  System.out.println("name"+' '+name);
  System.out.println("id"+" "+id);
System.out.println("age"+" "+age);
  System.out.println("Ur profession is"+" "+profn);

}

Person()
{
getdet();
}
}
class Teacher extends Person
{
Teacher()
{ super();}

}
class Student extends Person
{ Student()
  {super();}
 
}
interface Stud
 {
 int semno=4;
 void disp();
 }
class Collegestu extends Student implements Stud
{
 Collegestu()
{super();}

public void disp()
{
System.out.println("Ur Current semester is"+" "+semno);
}}
class Inherit
{
public static void main(String args[])
{ 
Scanner s=new Scanner(System.in);
System.out.println("Enter 1 for Teacher & 2 for student");
int no=s.nextInt();
if(no==1)
{
Teacher a=new Teacher();
a.putdet();
}
if(no==2)
{
Collegestu b=new Collegestu();
b.putdt();
b.disp();
}
}
}