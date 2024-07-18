class OddNumberException extends Exception
{
public OddNumberException(String odd)
{
super(odd);
}
}

public class excep_prg_2
{

static void evenorodd(int num) throws OddNumberException
{
if(num % 2!=0)
{
throw new OddNumberException("The number is odd " ) ;
}

}

public static void main(String args[])
{

 try 
 {
	evenorodd(3);
 }
 catch(OddNumberException e)
{
System.out.println("Exception occured:"+e);
}

}
}
