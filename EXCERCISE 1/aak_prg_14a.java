import java.io.*;
import java.util.*;

class Invoice 
{
String number;
String desc;
int quantity;
double price;

Invoice()
{
number = "250";
desc= " Bonda";
quantity = 1;
price=10;
}

	void setNumber(String num)
	{
		number=num;
	}
	void setDesc(String des)
	{
		desc=des;
	}
	void setQuantity(int quant)
	{
		quantity=quant;
	}
	void setPrice(double pric)
	{
		price=pric;
	}
	void getNumber()
	{
		System.out.println(number);
	}
	void getDesc()
	{
		System.out.println(desc);
	}
	void getQuantity()
	{
		System.out.println(quantity);
	}
	void getPrice()
	{
		System.out.println(price);
	}
	void getInvoice(double pri,int qua)
	{
		if(pri<0)
		{
		pri=0;
		}
		if(qua<=0)
		{
		pri=0;
		}
		
		double res=pri*qua;
		System.out.println(res);
	}
}
	
public class aak_prg_14a
{
public static void main(String args[])
{
Invoice in=new Invoice();
Scanner sc = new Scanner(System.in);

System.out.println("Enter number : " );
String numb=sc.nextLine();

System.out.println("Enter Description : " );
String de=sc.nextLine();

System.out.println("Enter Quantity : " );
int qu=sc.nextInt();

System.out.println("Enter Price : " );
double price=sc.nextDouble();
sc.nextLine();
in.getInvoice(price,qu);
}
}
