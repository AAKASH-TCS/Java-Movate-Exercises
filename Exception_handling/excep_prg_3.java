import java.util.*;
import java.io.*;

public class excep_prg_3 extends Exception
{
static FileReader fileReader= new FileReader("lol.txt");
static BufferedReader bufferReader = new BufferedReader(fileReader);
String con=null;
public static void main(String[] args)
{

try
{
bufferReader.close();
}
catch(Exception c)
{

}
}
}
