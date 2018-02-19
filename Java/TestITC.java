import java.io.*;
import java.util.*;
class Paytm 
{ Scanner y=new Scanner(System.in);
int ba,pmbal;
int bal;
synchronized void balance()
{
System.out.println("Enter the balance");
bal=y.nextInt();
}
synchronized void recharge()
{
System.out.println("Enter the amount to recharge");
ba=y.nextInt();
if(bal<ba)
{ System.out.println("Cannot Withdraw");
try {  wait(); }
catch(Exception e)
{}
}

bal=bal-ba;
pmbal=ba;
System.out.println("The paytm balance is"+pmbal);
}
synchronized void depbal()
{int dep;
System.out.println("enter the deposit amount");
dep=y.nextInt();
bal=dep+bal;
System.out.println(bal);
notify();
}
synchronized void withdraw()
{int ch;
System.out.println("1.chocolatesRs500 2.bag Rs1000");
System.out.println("Enter the choice");
ch=y.nextInt();
if(ch==1)
{ if(pmbal<500)
{ System.out.println("Recharge the paytm");
try{ wait();}
catch(Exception e)
{}
}
pmbal=pmbal-500;
System.out.println("remaining paytmbal  "+pmbal);
}
if(ch==2)
{    if(pmbal<1000)
{ System.out.println("Recharge the paytm");
try{ wait();}
catch(Exception e)
{}    }
pmbal=pmbal-1000;
System.out.println("remaining paytmbal"+pmbal);
}}

}
class TestITC
{
 public static void main(String args[])
{
 Paytm p=new Paytm();
Thread t1=new Thread()
{
public void run()
{ p.balance();

 }
};
t1.start();

Thread t2=new Thread()
{
public void run()
{ try{ Thread.sleep(2000);}
catch(Exception e){}
  p.recharge();
 }
};t2.setPriority(10);
t2.start();
Thread t3=new Thread()
{
public void run()
{ try{ Thread.sleep(5000);}
catch(Exception e){}
  p.depbal();
 }
};
t3.start();
Thread t4=new Thread()
{
public void run()
{  try{ Thread.sleep(8000);}
catch(Exception e){}
  p.withdraw();
 
 }
};t4.setPriority(1);
t4.start();
}
}