package day_17;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		String hSt="asds";
		System.out.println(hSt.hashCode());
		hs.add("hehe");
		hs.add("heihei");
		hs.add("haha");
		hs.add("lala");
		hs.add("xixi");
		
		for(Iterator it=hs.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
	}	

}
