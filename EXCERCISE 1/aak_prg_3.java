import java.util.*;
import java.io.*;

public class aak_prg_3
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float C,F;
System.out.println("Enter Fahrenheit ");
F=sc.nextFloat();
C=(F-32)*5/9;
System.out.println("The Temperature in Celsius is " + C);
}
}

