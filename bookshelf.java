package lab;
import java.util.*;

class book 
{
	int bid;
	String btitle, bauthor,bpublisher;
	int quantity;

	public book(int a, String b, String c, String d, int e)
	{
		bid=a;
		btitle=b;
		bauthor=c;
		bpublisher=d;
		quantity=e;
	}

}

public class bookshelf
{ 
	public static void main(String[] args) 
	{ 
		Map<Integer,book> map=new HashMap<Integer, book>(); 
		book b1=new book(101, "Java","James Gosling","Wiley",10); 
		book b2=new book(102,"C", "Dennis Richie","Mc Graw Hill", 20);
		book b3=new book(103,"HTML","Tim Berners Lee","Wiley",30);
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3); 
		for(Map.Entry<Integer, book> entry:map.entrySet())
		{
			int key=entry.getKey();
			book b=entry.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.bid+" "+b.btitle+" "+b.bauthor+" "+b.bpublisher+" "+b.quantity+"\n");
		}
	}

}
	
