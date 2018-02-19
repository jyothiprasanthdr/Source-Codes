import java.util.*;
import java.io.*;
class StringTest1
{
public static void main(String args[])
{
int a=35;
String s="Web Technology";
String str="welcome to";
String str3="welcome";
String s2=String.valueOf(a);
System.out.println(s2+"Stringconverted");
char c=s.charAt(2);
System.out.println(c+"Character at 2 of s");
str=str.concat(" "+s);
System.out.println(str);
System.out.println(str.isEmpty());
System.out.println(str.length());
System.out.println(str3.equals("welcome"));
System.out.println(str3.matches("welcome"));
System.out.println(str3.replace('e','i'));
System.out.println(str3.lastIndexOf("o"));
System.out.println(s.toUpperCase());

}}