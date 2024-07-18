import java.util.*;
import java.io.*;

public class aak_prg_7
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float a,b,c;
System.out.println("Enter The Numbers : ");
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();


float sum,prod,large,small,avg;
sum=a+b+c;
prod=a*b*c;
avg=(a+b+c)/3;
if(a<b && a<c)
{
small=a;
}
else if (b<a && b<c)
{
small=b;
}
else
{
small=c;
}
if(a>b && a>c)
{
large=a;
}
else if (b>a && b>c)
{
large=b;
}
else
{
large=c;
}

System.out.printf("The sum is : %f , The prod is : %f, The large num is : %f, The Small num is :%f ",sum,prod,large,small);

}
}
