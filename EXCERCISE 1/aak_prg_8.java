import java.util.*;
import java.io.*;

public class aak_prg_8
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float a,b,c;
System.out.println("Enter The Numbers : ");
a=sc.nextFloat();
b=sc.nextFloat();

if(a%b==0)
{
System.out.printf("%.1f is a multiple of %.1f",b,a);
}
else
{
System.out.println("IT is not multiple");
}
}
}
