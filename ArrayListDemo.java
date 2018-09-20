import java.util.*;
class  ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("A");
		a.add("B");
		a.add(10);
		a.add(null);
		a.add("A");
		System.out.println(a);
		a.remove("B");
		System.out.println(a);
		a.add(2,"S");
		a.add("N");
		System.out.println(a);

	}
}
