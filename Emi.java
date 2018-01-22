import java.util.*;
import java.io.*;
class BalanceLowException extends Exception
{
BalanceLowException(String s)
{
super(s);
}
}

class Emi
{
     
	public static void main(String args[]) throws BalanceLowException
	{
 	Scanner X=new Scanner(System.in);
        double bal=121100;//total amount+interest =121300
        double principal=100000,rate,em,time;
	System.out.print("Enter rate: ");
        rate = X.nextFloat();
        System.out.print("Enter time in year: ");
        time = X.nextFloat();
        rate=rate/(12*100); 
        time=time*12;
	
        em= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Monthly EMI is= "+em+"\n");
       
         try{
	for(int i=1;i<=36;i++)
	{
	bal=bal-em;
        if(bal<0)
        {
         throw new BalanceLowException("Balance low");
	}
}}
finally{
System.out.println("Exception is handled");
}
}}


           