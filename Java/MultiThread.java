import java.util.*;
import java.lang.*;
class MultiThread extends Thread
{
public void run()
{      
  

   for(int i=0;i<2;i++)
  {
  try
 { 
Thread.sleep(100);
} 
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}

 System.out.println("Thread Running"); 
 System.out.println("running by"+Thread.currentThread().getName());
 System.out.println(Thread.currentThread().getPriority());
  if(Thread.currentThread().isDaemon())
       {
       System.out.println("It is a Daemon thread");
       }
     else
    {
    System.out.println("user Thread");
    }
}
public static void main(String args[])
{
MultiThread a=new MultiThread();
MultiThread b=new MultiThread();
MultiThread c=new MultiThread();
MultiThread d=new MultiThread();
System.out.println("First thread"+a.getName());
System.out.println("First Thread"+a.getId());
a.setPriority(10);
b.setPriority(5);
c.setPriority(1);
d.setDaemon(true);

d.start();
a.start();
try { a.join(); }
catch(Exception e)
{
System.out.println(e);
}
b.start();
c.start();

} 
}