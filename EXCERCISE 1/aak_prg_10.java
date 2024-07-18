import java.util.*;
import java.io.*;

public class aak_prg_10
{
static double Volume(double r)
{

double vol ;
vol=(4/3)*3.14*r*r*r;
System.out.println(vol);
return vol;
} 
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
double a;
System.out.println("Enter The Radius : ");
a=sc.nextDouble();
Volume(a);
}
}
