import java.io.*;
import java.util.*;

class savingaccounts
{
static double annualInterestRate;
private double savingsBalance;

public savingaccounts()
{
annualInterestRate=0.00;
savingsBalance=0.00;
}
void setSavings(double savings)
{
this.savingsBalance=savings;
}
void setInterest(double interests)
{
this.annualInterestRate=interests;
}
void monthlyInterest(double saving)
{
this.savingsBalance=saving;
this.savingsBalance=this.savingsBalance+this.savingsBalance*(annualInterestRate/12);
System.out.println(savingsBalance);
}

static void modifyInterestRate()
{
double newrate;
Scanner c=new Scanner(System.in);
System.out.println("Enter new Interest Rate  :");
newrate=c.nextDouble(); 
annualInterestRate=newrate;
System.out.println("New Interest Updated ! ");
}
}
class aak_prg_17
{
public static void main(String[] args)
{
savingaccounts s1 = new savingaccounts();
savingaccounts s2 = new savingaccounts();
double savings1;
double savings2;
double interest;
Scanner sc=new Scanner(System.in);
System.out.println("Enter savings for saver 1 : ");
savings1=sc.nextDouble();
System.out.println("Enter savings for saver 2 : ");
savings2=sc.nextDouble();
s1.setInterest(4.00);
s2.setInterest(4.00);
s1.setSavings(savings1);
s2.setSavings(savings2);

System.out.println("After Adding Monthly Interest for Savings account 1"); 
s1.monthlyInterest(savings1);
System.out.println("After Adding Monthly Interest for Savings account 2"); 
s2.monthlyInterest(savings2);
s1.modifyInterestRate();
s2.modifyInterestRate();
System.out.println("After modifying the Interest Rate , Monthly interest amount for s1 and s2 is given respectively");
s1.monthlyInterest(savings1);
s2.monthlyInterest(savings2);
}
}