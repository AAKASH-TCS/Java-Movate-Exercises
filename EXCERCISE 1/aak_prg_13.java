import java.util.*;
import java.io.*;

 class Account
 {
	int Savings = 4000;
 void debit(int debitamt)
   {
   if(Savings > debitamt)
    {
	Savings=Savings-debitamt;
	System.out.println("The balance amount is : " + Savings);
    }
   else
    {
System.out.println("The balance amount is not enough for Withdrawl" );
    }
}
}
public class aak_prg_13 extends Account
  {
  public static void main(String args[])
  {	Scanner sc= new Scanner(System.in);
	Account ob = new Account();
	int debitamt;
	System.out.println("Enter the amount you want to debit from your account :");
	debitamt=sc.nextInt();
	ob.debit(debitamt);
  }
}
	
	
