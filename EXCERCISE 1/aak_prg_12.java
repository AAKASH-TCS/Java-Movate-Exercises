import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class aak_prg_12
{

static double average(int[] arr , int count)
{
int sum=0;
double avg=0;

for(int i=0;i<count;i++)
{
sum+=arr[i];
}
avg=(double)sum/count;


return avg;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the array Elements");
int[] arr=new int[20];
int count=0;
	for(int i=0;i<20;i++)
     {

	arr[i]=sc.nextInt();
	count++;
	if(arr[i]==-1)
	{	count-=1;
		break;
	}
     }

DecimalFormat df = new DecimalFormat("#.00");
System.out.println(df.format(average(arr,count)));
}
}
