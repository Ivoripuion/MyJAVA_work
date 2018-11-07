package day_17;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest {

	public static void main(String[] args) {
		 
		ArrayList al=new ArrayList();
		al.add(new Person(21,"John"));
		al.add(new Person(25,"Black"));
		al.add(new Person(23,"Abgaba"));
		al.add(new Person(22,"Likuyaa"));
		for(Iterator it=al.iterator();it.hasNext();) {
			Person p= (Person)(it.next());
			System.out.println(p.getName()+"::"+p.getAge());
		}
		
		
	}

}
