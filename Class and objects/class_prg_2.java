import java.util.*;
import java.io.*;

class movie
{
String title;
String studio;
String rating;
public movie(String Mtitle,String Mstudio , String Mrating)
{
this.title=Mtitle;
this.studio=Mstudio;
this.rating=Mrating;
}
public movie(String Mtitle,String Mstudio)
{
this.title=Mtitle;
this.studio=Mstudio;
String Mrating="PG";
this.rating=Mrating;
}
void getPG(movie m[])
{
for(int i =0;i<m.length;i++)
{
if(m[i].rating=="PG")
{
System.out.println("Title : " + m[i].title);
System.out.println("studio : " + m[i].studio);
System.out.println("Rating : " + m[i].rating);
System.out.println("");
}
else
{
continue;
}
}
}
}

public class class_prg_2
{
public static void main(String[] args)
{
movie m[]=new movie[3];
m[0]=new movie("Avengers","Marvel Studios" ,"UG");
m[1]=new movie("Avengers : Age of Ultron","Marvel Studios");
m[2]=new movie("Batman","DC Studios");
m[0].getPG(m);
}
}