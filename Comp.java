import java.util.Scanner;
class Comp
{
int real,imag;
void Comp()
{}
Comp(int r,int i)
{
real=r;
imag=i;
}
void add(Comp c1,Comp c2)
{
this.real=c1.real+c2.real;
this.imag=c1.imag+c2.imag;
System.out.println("addition of complex nos"+"+"+real+"i"+imag);

}
void sub(Comp c1,Comp c2)
{
this.real=c1.real-c2.real;
this.imag=c1.imag-c2.imag;
System.out.println("sub of complex nos"+"+"+real+"i"+imag);

}
void mul(Comp c1,Comp c2)
{

this.real=c1.real*c2.real;
this.imag=c1.imag*c2.imag;
System.out.println("mul of complex nos"+"+"+real+"i"+imag);

}
public static void main(String args[])
{
int r1,r2,i1,i2;
Scanner sc=new Scanner(System.in);
r1=sc.nextInt();
r2=sc.nextInt();
i1=sc.nextInt();
i2=sc.nextInt();
Comp c1=new Comp(r1,i1);
Comp c2=new Comp(r2,i2);
Comp c=new Comp(0,0);
c.add(c1,c2);
c.sub(c1,c2);
c.mul(c1,c2);

}
}