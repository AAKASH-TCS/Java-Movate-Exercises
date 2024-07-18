import java.util.*;
import java.io.*;

public class aak_prg_5
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a,b;
System.out.println("Enter The Numbers : ");
a=sc.nextInt();
b=sc.nextInt();

int sum , diff ;
float div;
sum=a+b;
if(a>b)
{
diff=a-b;
div=a/b;
}
else
{
diff=b-a;
div=b/a;
}

System.out.printf("The sum is : %d , The Diff is : %d, The Quotient is : %f",sum,diff,div);

}
}
