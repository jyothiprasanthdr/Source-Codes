import java.util.Scanner;
class Check
{int h,a1,a2,a3,b1,b2,b3,g;
void coll(int p1,int p2,int p3,int q1,int q2,int q3)
{a1=p1;
a2=p2;
a3=p3;
b1=q1;
b2=q2;
b3=q3;
g=(b2-b1)/(a2-a1);
h=(b3-b1)/(a3-a1);
if(g==h)
{ System.out.println("Collinear");
}
else
{
System.out.println("Not collinear");
}}}
class Triangle 
{
public static void main(String args[])
{
int x1,x2,x3,y1,y2,y3;
Scanner a=new Scanner(System.in);
Check ob=new Check();
System.out.println("Enter the points");
x1=a.nextInt();
x2=a.nextInt();
x3=a.nextInt();
y1=a.nextInt();
y2=a.nextInt();
y3=a.nextInt();
System.out.println("the points are"+" "+(x1+","+y1)+"  "+(x2+","+y2)+" "+(x3+","+y3));
ob.coll(x1,x2,x3,y1,y2,y3);
}}
