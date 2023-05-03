package lab;
import java.util.Scanner;

class account extends Exception
{
	int aid,i;
	float amt,bal=0,w;
	Scanner s= new Scanner(System.in);
	account(int a)
	{
		aid=a;
	}
	void input() throws Exception 
	{
		System.out.println("Account num:"+aid);
		do 
		{
			System.out.println("enter your choice:\n 1:deposit \n 2:withdrawal \n 3:exit");
			i=s.nextInt();
			if(i==1)
			{
				System.out.println("enter the amount to be deposited:");
				amt=s.nextInt();
				bal+=amt;
				System.out.println("balance:"+bal);
			}
			else if(i==2)
			{
				System.out.println("enter the amount to be withdrawan:");
				w=s.nextInt();
				if(w<bal)
				{
					bal-=w;
					System.out.println("balance:"+bal);
				}
				else
				{
					throw new Exception();
				}
			}
			else
			{
				break;
			}
		}while(i<3);
	}
}
public class exception {
	public static void main(String arg[])
	{
		account a= new account(101);
		try 
		{
			a.input();
		}
		catch(Exception e)
		{
			System.out.println("insufficient fund");
		}
	}
}
