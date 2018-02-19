import java.io.*;
import java.util.*;
import java.util.regex.*;
class Occur
{
  public static void main(String[] args)
   {
    Scanner Sc=new Scanner(System.in);
    String s1,s2,s3;
    int i=0;
    System.out.println("Enter two lines");
    s1=Sc.nextLine();
    s2=Sc.nextLine();
    System.out.println("Enter the word to search for...");
    s3=Sc.next();
    Pattern p = Pattern.compile(s3);
    Matcher m = p.matcher(s1);
    while (m.find()) 
    {
     i++;
    }
    Matcher m1 = p.matcher(s2);
    while (m1.find()) 
    {
     i++;
    }
    System.out.println("It occurs for "+i+" times");
    }
 }