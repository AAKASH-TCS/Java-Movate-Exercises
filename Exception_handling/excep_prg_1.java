import java.util.*;
import java.io.*;

public class excep_prg_1
{
public static void main(String[] args)
{
try
{
int a=100;
a=a/0;
System.out.println(a);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}