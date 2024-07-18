import java.io.*;

public class Bufferedread
{
public static void main(String[] args) throws IOException
{
FileReader fr=new FileReader("C:\\Users\\trainer\\Desktop\\JAVA_PROGRAMS\\Exception_handling\\wordd.txt");
BufferedReader br=new BufferedReader(fr);
int i;
while((i=br.read())!=-1){
System.out.print((char)i);
}
br.close();
fr.close();
}
}