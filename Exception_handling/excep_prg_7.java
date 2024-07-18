import java.util.*;
import java.io.*;
 class NoVowelsException extends Exception
{
public NoVowelsException(String a)
{
super(a);
}
}
public class excep_prg_7 
{
public static void vowels(String str) throws NoVowelsException
{
boolean vowelPresent=false;
String Check=str.toLowerCase();

for(int i=0;i<Check.length();i++)
{
char a=Check.charAt(i);
if(a=='a'|| a=='e' || a=='o' || a=='u'|| a=='i')
{
vowelPresent=true;
break;
}
}
if(!vowelPresent)
{
throw new NoVowelsException("There is no Vowel Present");
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
try
{
vowels(str);
}
catch(NoVowelsException e)
{
System.out.println(e);
}
}
}

