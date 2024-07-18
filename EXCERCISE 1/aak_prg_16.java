import java.util.*;
import java.io.*;

class date
{
int month;
int year;
int day;

public date()
{
int month=1;
int day=1;
int year=2024;
}
void getMonth()
{
System.out.println(month);
}
void getYear()
{
System.out.println(year);
}
void getDay()
{
System.out.println(day);
}
void setDay(int da)
{
this.day=da;
}
void setYear(int yea)
{
this.year=yea;
}
void setMonth(int mont)
{
this.month=mont;
}
void DisplayDate()
{

System.out.println("Date is  : " + this.day +"/"+this.month + "/" + this.year);
}

}

public class aak_prg_16
{
public static void main(String[] args)
{
date df=new date();
int day;
int month;
int year;

Scanner sc= new Scanner(System.in);
System.out.println("Enter day : ");
day=sc.nextInt();
System.out.println("Enter month : ");
month=sc.nextInt();
System.out.println("Enter year : ");
year=sc.nextInt();
df.setDay(day);
df.setMonth(month);
df.setYear(year);
df.DisplayDate();




}
}
