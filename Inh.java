import java.util.*;
class Person
{ final String coll="MIT";
int id;;
String name;
void col()
{
System.out.println("College Name"+" "+coll);
}
Scanner sc=new Scanner(System.in);
}
interface College
{
int cid=0004;
}
class Student extends Person implements College 
{ Student()
  { det();
  getdet();
  }
  void det()
  {
   System.out.println("Student Details");
  }
  void getdet()
  {
  System.out.println("Enter the student name and id");
  name=sc.next();
  id=sc.nextInt();
  }
  void putdet()
  { col();
    System.out.println("College id"+" "+cid);
  }
}
class Collegestu extends Student
{
Collegestu()
{
super();
}
 void det()
 { 
 System.out.println("College student Details");
 }
 void putdt()
  {
    System.out.println("Name"+" "+name);
    System.out.println("Id"+" "+id);
    putdet();
  }
}
class Teacher extends Person implements College
{ Scanner s=new Scanner(System.in); 
void teach()
{
System.out.println("Enter the Teacher name and id");
name=s.next();
id=s.nextInt();
}
void teach2()
{

System.out.println("Name"+" "+name);
System.out.println("Id"+" "+id);
}
}
class Inh
{
public static void main(String args[])
{
 Collegestu c=new Collegestu();
Teacher t=new Teacher();
t.teach();
c.putdt();
t.teach2();

}
} 
	