package lab;

import java.lang.Math.*;
import java.text.DecimalFormat;
class bank{
	double r,amt,p,s,c;
	int t;
	DecimalFormat df=new DecimalFormat("#0.00");
	bank(double d,float b,int t)
	{
		r=d;
		amt=b;
		this.t=t;
	}
	void compute()
	{
		p=amt+(amt*r)/100F;
		System.out.println("priciple="+df.format(p));
		s=p*(1+r*t);
		c=p*Math.pow((1+r/100),t);
		System.out.println("simple interest sbi="+df.format(s)+"\n compound interest="+df.format(c));
	}
}
class sbi extends bank
{
	sbi(double d,float b,int t)
	{
		super(d,b,t);
	}
	void compute()
	{
		p=amt+(amt*r)/100F;
		s=p*(1+r*t);
		c=p*Math.pow((1+r/100),t);
		System.out.println("\nsimple interest sbi="+df.format(s)+"\n compound interest="+df.format(c));
	}
}
class icse extends bank
{
	icse(double d,float b,int t)
	{
		super(d,b,t);
	}
	void compute()
	{
		p=amt+(amt*r)/100F;
		s=p*(1+r*t);
		c=p*Math.pow((1+r/100),t);
		System.out.println("\nsimple interest icici="+df.format(s)+"\n compound interest="+df.format(c));
	}
}
public class poly
{
	public static void main(String arg[])
	{
		bank b=new bank(2,1234,1);
		 b.compute();
		 sbi s=new sbi(3,3214,1);
		 s.compute();
		 icse i=new icse(2,3214,1);
		 i.compute();
	}
}
