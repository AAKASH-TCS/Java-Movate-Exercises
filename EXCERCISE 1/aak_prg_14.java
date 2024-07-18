import java.util.*;
import java.io.*;
 class invoice
{

String number;
String description;
int quantity;
double price;

public invoice()
{
String number="25";
String description="Meal";
int quantity=1;
double price=25.0;
}
void getNumber()
{
System.out.println(number);
}
 void setNumber(String newNumber)
{
number=newNumber;
} 
void getDescription()
{
System.out.println(description);
}
 void setDescription(String newDescription)
{
description=newDescription;
}
void getQuantity()
{
System.out.println(number);
}
void setQuantity(int newQuantity)
{
quantity=newQuantity;
}
void getPrice()
{
System.out.println( price);
}
void setPrice(double newPrice)
{
price=newPrice;
}
double getInvoice(double pric,int quant)
{

double res=(this.price)*(quant);
System.out.println(res);
return res;
}
}
public class aak_prg_14 
{
public static void main(String args[])
{ Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of Records of Invoices ");
int num;
num=sc.nextInt();
invoice in  = new invoice();


System.out.println("Enter the Number for Invoice record :");
sc.nextLine();
String numb=sc.nextLine();
System.out.println("");
System.out.println("Enter the description for Invoice record :");
String desc=sc.nextLine();
System.out.println("");
System.out.println("Enter the Quantity for Invoice record :");
int quantity=sc.nextInt();
System.out.println("");
System.out.println("Enter the Price for Invoice record :");
double price=sc.nextDouble();
in.getInvoice(price,quantity);
//invoices[i].setNumber(numb);
//invoices[i].setDescription(desc);
//invoices[i].setQuantity(quantity);
//invoices[i].setPrice(price);
//invoices[i].getNumber();
//invoices[i].getDescription();
//invoices[i].getQuantity();
//invoices[i].getPrice();
}
}





