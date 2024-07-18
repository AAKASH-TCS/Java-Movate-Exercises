import java.util.*;
import java.io.*;

class employee
{
String firstname;
String lastname;
double salary;

public employee()
{
String firstname="";
String lastname="";
double salary=0;
}
void getFirst()
{
System.out.println(firstname);
}
void getLast()
{
System.out.println(lastname);
}
void getSalary()
{
System.out.println(salary);
}
void setFirst(String fname)
{
this.firstname=fname;
}
void setLast(String lname)
{
this.lastname=lname;
}
void setSalary(double sal)
{
this.salary=sal;
}
void yearsal(double sals)
{
this.salary=sals;
salary*=12;
System.out.println("Yearly Salary : " + salary);
}
void incsal(double sals)
{
this.salary=(sals*0.1)+sals;
System.out.println("after 10% hike : " + salary);
}
}

public class aak_prg_15 
{
public static void main(String[] args)
{
employee e1=new employee();
employee e2=new employee();
Scanner sc= new Scanner(System.in);
System.out.println("enter firstname for Emp1:");
String empf1;
String empl1;
double sal1;
empf1=sc.nextLine();
System.out.println("Enter Lastname for Emp1 : ");
empl1=sc.nextLine();
System.out.println("Enter salary for EMP1");
sal1=sc.nextDouble();
sc.nextLine();

String empf2;
String empl2;
double sal2;
System.out.println("enter firstname for Emp2:");
empf2=sc.nextLine();
System.out.println("Enter Lastname for Emp2 : ");
empl2=sc.nextLine();
System.out.println("Enter salary for EMP2");
sal2=sc.nextDouble();

e1.setFirst(empf1);
e1.setLast(empl1);
e1.setSalary(sal1);
e2.setFirst(empf2);
e2.setLast(empl2);
e2.setSalary(sal2);

System.out.println("FirstName of first Emp :" ); e1.getFirst();
System.out.println("LastName of first Emp :" ); e1.getLast();
System.out.println("Salary of first Emp :" ); e1.getSalary();
System.out.println("Yearly salary of first Emp :" ); e1.yearsal(sal1);
System.out.println("Salary of First emp after Hike : " ); e1.incsal(sal1);

System.out.println("FirstName of Second Emp :" ); e2.getFirst();
System.out.println("LastName of Second Emp :" ); e2.getLast();
System.out.println("Salary of Second Emp :" ); e2.getSalary();
System.out.println("Yearly salary of Second Emp :" ); e2.yearsal(sal2);
System.out.println("Salary of Second emp after Hike : " ); e2.incsal(sal2);
}
}
