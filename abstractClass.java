package lab;

import java.util.Scanner;

abstract class theory
{
	int s1,s2;
	void tin() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your theory marks");
		System.out.println("Enter sub1 marks:");
		s1=s.nextInt();
		System.out.println("Enter sub2 marks:");
		s2=s.nextInt();
	}
	 abstract String tresult();
}

abstract class practical extends theory
{
	int s1,s2;
	void pin() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter your practical marks");
		System.out.println("Enter sub1 marks:");
		s1=s.nextInt();
		System.out.println("Enter sub2 marks:");
		s2=s.nextInt();
	}
	String presult()
	{
		
		if(s1>=50 && s2>=50)
		{
			return "pass";
		}
		else
		{
			return "fail";
		}
	}
	abstract void finalResult(String a,String b);
}

public class abstractClass extends practical
{
	String tresult()
	{
		if(s1>=50 && s2>=50)
		{
			return "pass";
		}
		else
		{
			return "fail";
		}
	}
	void finalResult(String a,String b)
	{
		if(a=="pass" && b=="pass")
		{
			System.out.println("   Over all pass");
		}
		else
		{
			System.out.println("   Fail");
		}
	}
	public static void main(String arg[])
	{
		abstractClass a=new abstractClass();
		a.tin();
		a.pin();
		String s3=a.tresult();
		String s4=a.presult();
		System.out.println("Theory result:"+s3);
		System.out.println("Practical result:"+s4);
		System.out.println("Final result:");
		a.finalResult(s3,s4);
	}

}
