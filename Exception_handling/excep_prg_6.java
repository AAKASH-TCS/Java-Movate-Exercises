import java.io.*;
import java.util.*;
 	class DuplicateException extends Exception
	{
		public DuplicateException ( String a)
		{
			super(a);
		}
	}
	public class excep_prg_6 
		{
			public static void main(String[] args)throws DuplicateException
			{
				Scanner sc=new Scanner(System.in);
				int arr[]=new int[10];
				for(int i =0 ; i <10; i++)
				{
					System.out.printf("Enter Array's %d Element" ,i+1);
					arr[i]=sc.nextInt();
				}
					
					for(int i=0;i<10;i++)
						{
							for(int j=i+1;j<9;j++)
							{
								try
									{
										if(arr[i]!=arr[j])
											{
											continue;
											}
										else
											{
												throw new DuplicateException("There is a Duplicate");
												
											}
									}
								catch(DuplicateException e)
									{	
										System.out.println(e);
										
									}
							}
						}
			}
		}


  
