import java.util.regex.*;
import java.io.*;
import java.util.*;
class Facebook
{ String name,pwd,age,mobno;
Scanner x=new Scanner(System.in);
void get()
{
System.out.println("Enter the name");
name=x.next();
System.out.println("Enter the pwd");
pwd=x.next();
System.out.println("Enter the age");
age=x.next();
System.out.println("Enter the mobileno");
mobno=x.next();
}
void put()
{
System.out.println("Name"+" "+name);
System.out.println("Password"+" "+pwd);
System.out.println("age"+" "+age);                      
System.out.println("Mobileno"+" "+mobno);
}
void check()
{
boolean b=Pattern.matches("[a-zA-Z]+",name);
System.out.println(b);
boolean b1=Pattern.matches("[a-zA-Z0-9](?=.*[@#$%])(?=.*[A-Z]).{1,8}+",pwd);
System.out.println(b1);
boolean b2=Pattern.matches("[^0-18]+",age);
System.out.println(b2);
boolean b3=Pattern.matches("[0-9]{10}+",mobno);
System.out.println(b3);
}
public static void main(String args[])
{
Facebook o=new Facebook();
o.get();
o.put();
o.check();
}
}