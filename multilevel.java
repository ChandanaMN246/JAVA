package lab;

class doctor
{
	int id;
	String dname,da;
	doctor(int a, String b, String c)
	{
		id=a;
		dname=b;
		da=c;
	}
	String display()
	{
		return ("id:"+id+" docter name:"+dname+" adress:"+da);
	}
}
class surgen extends doctor
{
	int op,pid;
	String sp;
	surgen(int a, String b, String c,int d, String e, int f)
	{
		super(a,b,c);
		op=d;
		sp=e;
		pid=f;
	}
	String display()
	{
		return ("id:"+id+" docter name:"+dname+" adress:"+da+" opd num:"+op+" spalization:"+sp+" paciant id:"+pid);
	}
}
class hosptal extends surgen
{
	String hname,hadd;
	hosptal(int a, String b, String c,int d, String e, int f,String g,String h)
	{
		super(a,b,c,d,e,f);
		hname=g;
		hadd=h;
	}
	String display()
	{
		return ("id:"+id+" docter name:"+dname+" adress:"+da+" opd num:"+op+" spalization:"+sp+" paciant id:"+pid+" hospital name:"+hname+" hoapital address:"+hadd);
	}
}

public class multilevel
{
	public static void main(String arg[])
	{
		doctor d=new doctor(1,"chandu","#236,woc");
		System.out.println(d.display());
		surgen s= new surgen(2,"rupa","#420,ecity",414,"heart",123);
		System.out.println(s.display());
		hosptal h= new hosptal(3,"divya","#123,wecity",234,"eye",456,"abcd","#768,sdfghjkkl");
		System.out.println(h.display());
	}
}