import java.util.Scanner;
class Check
{ int x,y,z;
Check()
{
System.out.println("Default Constructor");
}
Check(int a,int b,int c)
{
x=a;
y=b;
z=c;
}
Check(Check cp)
{
x=cp.x;
y=cp.y;
z=cp.z; 

if(x+y>z)
{
if(y+z>x)
{
if(x+z>y)
{System.out.println("Triangle is valid");
}
else
{System.out.println("Triangle is not valid");
}}
else
{System.out.println("Triangle is not valid");
}}
else
{System.out.println("Triangle is not valid");
}}}
class Validtri
{
public static void main(String args[])
{ int s1,s2,s3;
Scanner sc=new Scanner(System.in);
System.out.println("enter the triangle sides");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
System.out.println("side1"+s1+"side2"+s2+"side3"+s3);
Check ob1=new Check(s1,s2,s3);
Check ob2=new Check(ob1);

}
}