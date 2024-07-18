import java.util.*;
import java.io.*;

public class aak_prg_9
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int largest=0;
int counter=10;
System.out.println("Enter the number of elements you want to store ");
int[] arr=new int[counter];
System.out.println("Enter the array elements");
for(int i=1;i<=counter;i++)
{
System.out.println("Counter : " + i);
// I WHEN it is 10 
if(i==10)
{
System.out.println("this is your last Iteration to enter details");
}
arr[i-1]=sc.nextInt();
System.out.println("The number entered : " + arr[i-1]);
if(largest>arr[i-1])
{
System.out.println("The largest number so far is :" + largest);
continue;
}
else
{
largest=arr[i-1];
}
System.out.println("The largest number so far is :" + largest);
}
}
}
