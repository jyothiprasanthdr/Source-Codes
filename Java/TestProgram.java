import java.util.*;
class Person
{
	final String cname="Madras Institute of Technology";
	protected String name;
	protected int id;
}
class Student extends Person 
{
	void show()
	{
		System.out.println("Student Details");
	}
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Name : ");
		name=sc.next();
		System.out.println("Enter student ID : ");
		id=sc.nextInt();
	}
	void setDetails()
	{
		System.out.println("\t\t\t" + cname);
		System.out.println("Student Name : " + name);
	} 
}
interface Details
{
	int cid=004;
	void disp();
}
class CollegeStudent extends Student implements Details
{
	void show()
	{
		System.out.println(" College Student Details");
	}
	void stDetails()
	{
		super.setDetails();
		System.out.println("Student ID : " + id);
	}
	public void disp()
	{
		System.out.println("College ID : " + cid);
	}
}
class Teacher extends Person
{
	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Teacher Name : ");
		name=sc.next();
		System.out.println("Enter Teacher ID : ");
		id=sc.nextInt();
	}
	public void setDetails()
	{
		System.out.println("Teacher Name : " + name);
		System.out.println("Teacher ID : " + id);
	}
}

class TestProgram
{
	public static void main(String args[])
	{
		CollegeStudent c=new CollegeStudent();
		Teacher t=new Teacher();
		Details d=new CollegeStudent();
		c.getDetails();
		t.getDetails();
		c.show();
		c.stDetails();
		t.setDetails();
		d.disp();
	}
}
