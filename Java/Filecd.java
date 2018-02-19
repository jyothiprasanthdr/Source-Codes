import java.io.*;
import java.util.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
class Files
{
void compress()
{try{
FileInputStream fin=new FileInputStream("jyothi.txt");
FileOutputStream fout=new FileOutputStream("compress.txt");
DeflaterOutputStream df=new DeflaterOutputStream(fout);

int i;
while((i=fin.read())!=-1)
{
df.write((byte)i);
df.flush();
}
fin.close();
df.close();
fout.close();
}
catch(Exception e)
{
System.out.println(e);
}
}}
class File1{
void decompress()
{try {
FileInputStream fin=new FileInputStream("compress.txt");
InflaterInputStream in=new InflaterInputStream(fin);
FileOutputStream fout=new FileOutputStream("decompress.txt");
int i;

while((i=in.read())!=-1)
{
fout.write((byte)i);
fout.flush();
}fin.close();
fout.close();
in.close();
}
catch(Exception e)
{
System.out.println(e);
}
}}
class Filecd
{
public static void main(String args[])
{  int ch;
Files a=new Files();
File1 b=new File1();
Scanner x=new Scanner(System.in);
 System.out.println("Enter the choice 1.compress 2.decompress");
ch=x.nextInt();

if(ch==1)
{
 a.compress();
}
if(ch==2)
{
b.decompress();
}

}
} 