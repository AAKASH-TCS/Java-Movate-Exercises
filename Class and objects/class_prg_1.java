import java.util.*;
import java.io.*;
import java.lang.*;
class holiday
{
String name ;
int day;
String month;

public holiday(String nname , int dday , String mmonth)
{
this.name = nname;
this.day = dday;
this.month=mmonth;
}

boolean inSameMonth(String mon1, String mon2)
{
return mon1.equals(mon2);
}

double avgdate ( holiday h[])
{
int sum=0;
for(int i=0; i <3;i++)
{
sum+=h[i].day;
}

double avg=(double)sum/3;
return avg;
}
}

public class class_prg_1
{
public static void main(String[] args)
{
holiday h1=new holiday("Independence day",4,"January");
holiday h2=new holiday("Pet day",6,"February");
holiday h3=new holiday("Independence day" , 4, "July");
System.out.println(h1.inSameMonth(h1.month,h2.month));
holiday[] h=new holiday[3];
h[0]=new holiday("Independence Day",10,"August");
h[1]=new holiday("Baby Day",10,"September");
h[2]=new holiday("Baby Day",10,"September");
double average=h1.avgdate(h);
System.out.println(average);
}
}


