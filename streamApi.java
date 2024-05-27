package DSA;

import java.util.Arrays;
import java.util.List;

class book
{
	int id;
	String aname;
	String bname;

public book(int id, String aname, String bname) {
		super();
		this.id = id;
		this.aname = aname;
		this.bname = bname;
}

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
	return "book [id=" + id + ", aname=" + aname + ", bname=" + bname + "]";
}
}
public class streamApi {

	public static void main(String args[])
	{
		book b1=new book(12,"rakesh","joha valker");
		book b2=new book(31,"mukesh","rock");
		book b3=new book(56,"mala","shailey\n");
		book b4=new book(41,"ajit","jaitley\n");
		book b5=new book(76,"raam","max\n");
		book b6=new book(78,"ramesg","warner\n");
		List<book> books=Arrays.asList(b1,b2,b3,b4,b5,b6);
		System.out.println(books);
		for(Object ob:books)// old tradition style
		System.out.println(ob);
		books.stream().forEach(p->System.out.println(p)); // lambda expression
  books.stream().forEach(System.out::println);
   books.stream().skip(3).forEach(System.out::println);
	books.stream().limit(3).forEach(System.out::println);
	long count=books.stream().count();
		System.out.println(count);
books.stream().skip(3).limit(2).forEach(System.out::println);;
		books.stream().map(x->x.getAname()).forEach(System.out::println);
		books.stream().map(x->x.getAname()+" "+x.getBname()).forEach(System.out::println);
		books.stream().filter(x->x.getBname().equals("jaitley")).forEach(System.out::println);
		books.stream().filter(x->x.getId()>=50).forEach(System.out::println);
		books.parallelStream().forEach(System.out::println); // this will random display as fast.
		List<Integer> in=Arrays.asList(90,-90,43,12,3,4,45,-3);
		in.stream().sorted().forEach(System.out::println);			
		
	}
}

