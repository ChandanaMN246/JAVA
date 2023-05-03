package lab;
import java.lang.reflect.*;
import java.util.Calendar;
import java.util. GregorianCalendar;
import java.util.Date;

public class classloder {
	public static void main(String arg[])throws ClassNotFoundException
	{
		Class cls=Class.forName("java.util.Date"); 
		Constructor c[]=cls.getDeclaredConstructors(); 
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].getClass());
		} 
		Method m[]=cls.getDeclaredMethods();
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].toString()); 
			System.out.println(m[i].getName());
		}
		
		Field f[]=cls.getDeclaredFields(); 
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i].toString());
		}
		GregorianCalendar ge=new GregorianCalendar();
		System.out.println(ge.get(Calendar.DAY_OF_MONTH));
		int year=2104;
		if(ge.isLeapYear(year))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}

}
