import java.io.*;
import java.util.*;
class Filerw
{ 
 String str;
Scanner x=new Scanner(System.in);
void write()
{
System.out.println("Enter the string u want to write in the file");
str=x.nextLine();
try
{
FileWriter fw=new FileWriter("jyothi.txt");
fw.write(str);
fw.close();
}
catch(Exception e)
{
System.out.println("Written Succesfully");
}
}
void reads() throws Exception
{
  FileReader fr=new FileReader("jyothi.txt");
    int i;
    while((i=fr.read())!=-1)
    {
    System.out.print((char)i);
    }
    fr.close();}


public  static void main(String args[])
{ Scanner y=new Scanner(System.in);
Filerw a=new Filerw();
int ch;
System.out.println("1.write 2.Read");
ch=y.nextInt();
if(ch==1)
{ a.write();}
if(ch==2)
{ try {a.reads();}
catch(Exception e)
{
System.out.println("Read Succesfully");
}
}

}}