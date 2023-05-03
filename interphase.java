package lab;

interface school
{
	void result();
	void display();
}
class classroom implements school
{
	int r,s1,s2,s3;
	String name,rs;
	float avg,total;
	classroom(int a,String b,int c,int d,int e)
	{
		r=a;
		name=b;
		s1=c;
		s2=d;
		s3=e;
	}
	public void result()
	{
		total=s1+s2+s3;
		avg=total/3;
		if(s1>=50 && s2>=50 && s3>=50 && avg>=90)
		{
			rs="A+";
		}
		else if(s1>=50 && s2>=50 && s3>=50 && avg>=80)
		{
			rs="A";
		}
		else if(s1>=50 && s2>=50 && s3>=50 && avg>=70)
		{
			rs="B+";
		}
		else if(s1>=50 && s2>=50 && s3>=50 && avg>=65)
		{
			rs="B";
		}
		else if(s1>=50 && s2>=50 && s3>=50 && avg>=60)
		{
			rs="C+";
		}
		else if(s1>=50 && s2>=50 && s3>=50 && avg>=50)
		{
			rs="C";
		}
		else 
		{
			rs="fail";
			
		}
	}
	public void display()
	{
		System.out.println("id:"+r+"  name:"+name+"  total:"+total+"  average:"+avg+"\nfinal result:"+rs);
	}
}

public class interphase 
{
	public static void main(String arg[])
	{
		classroom c=new classroom(1,"chandu",89,90,95);
		c.result();
		c.display();
		classroom c1=new classroom(2,"rupa",80,82,83);
		c1.result();
		c1.display();
	}
}
