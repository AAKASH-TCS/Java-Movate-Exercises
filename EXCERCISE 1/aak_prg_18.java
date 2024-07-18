import java.io.*;
import java.util.*;

class book
{
String bookname="";
int isbn;
String authorname="";
String publisher="";
public book()
{
bookname="default";
isbn=0;
authorname="default";
publisher="default";

}
void setBookName(String Bookname)
{
this.bookname=Bookname;
}
void setIsbn(int isbn)
{
this.isbn=isbn;
}
void setAuthor(String authorname)
{
this.authorname=authorname;
}
void setPublisher(String pubname)
{
this.publisher=pubname;
}
void getBookname()
{
System.out.println("Book name : " + bookname);
}
void getIsbn()
{
System.out.println("The Isbn : " + isbn);
}
void getAuthor()
{
System.out.println("The author's name is : " + authorname);
}
void getPublisher()
{
System.out.println("The Publisher's name is : " + publisher);
}
void getBookInfo()
{
System.out.printf("\n \t Book Info \n bookname: %s \n ISBN : %d \n Author: %s \n Publisher : %s \n",bookname,isbn,authorname,publisher);
}

}
public class aak_prg_18
{
public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);
book[] b = new book[30];
boolean end = false;
for(int i =0 ; i < 30 ; i++)
{
b[i]=new book();

System.out.println(" Enter book details  ");
System.out.println(" Enter book Name : ");
String name = sc.nextLine();
b[i].setBookName(name);
System.out.println(" Enter book isbn : ");
int isbn = sc.nextInt();
b[i].setIsbn(isbn);
sc.nextLine();
System.out.println(" Enter Author name : ");
String authorname=sc.nextLine();

b[i].setAuthor(authorname);
System.out.println(" Enter Publisher name : ");
String publisher = sc.nextLine();
b[i].setPublisher(publisher);

System.out.print("The Details are shown below ");

b[i].getBookInfo();

char ans ;
System.out.print("Do you want to input more books(Y/N) ? " );
ans=sc.next().charAt(0);
sc.nextLine();

if(ans=='Y'||ans=='y')
{
continue;
}
else
{
break;
}
}

}
}




