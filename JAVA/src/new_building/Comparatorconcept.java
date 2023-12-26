package new_building;
import java.util.Arrays;
import java.util.Comparator;

final class Book
{
	int price;
	String name;
	public Book(int price,String name)
	{
		this.price=price;
		this.name=name;	
	}
	public String toString()
	{
		return "price= "+price+", Name="+name;
	}
}
class Booksort implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Book b1=(Book) o1;
		Book b2=(Book) o2;
		return b1.price-b2.price;
	}
}
public class Comparatorconcept {
	public static void main(String[] args) {
		Book a1=new Book(200,"java");
		Book a2=new Book(19,"python");
		Book a3=new Book(500,"C");
		Book[] arr={a1,a2,a3};
		Arrays.sort(arr,new Booksort());
		for (int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
