import java.util.regex.*;
import java.io.*;
import java.util.*;
class RegexEx
{String str1,str2;
Scanner X=new Scanner(System.in);
void match()
{
System.out.println("Enter the string ");
str1=X.next();
System.out.println("Enter the word to search ");
str2=X.next();
Pattern p=Pattern.compile(str1);
Matcher m=p.matcher(str2);
boolean b=m.matches();
int count = 0;
while(matcher.find()) {
            count++;
System.out.println(count);
}
}
public static void main(String args[])
{
RegexEx ob=new RegexEx();
ob.match();
}}
