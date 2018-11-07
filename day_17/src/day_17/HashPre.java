package day_17;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * 去除ArrayList中的重复的元素
 * 
 * 
 * */
public class HashPre {

	public static void main(String[] args) {
//		show_1();
		
		show_2();
	}

	/**
	 * 
	 */
	private static void show_2() {
		ArrayList hs=new ArrayList();
		hs.add(new Person(23,"Jack"));
		hs.add(new Person(41,"Jacket"));
		hs.add(new Person(12,"Jacketa"));
		hs.add(new Person(12,"Jacketa"));
		hs.add(new Person(52,"Jacketate"));
		hs.add(new Person(19,"Jacketater"));
		
		System.out.println(hs);
		System.out.println(getSingle(hs));
	}

	/**
	 * 
	 */
	private static void show_1() {
		ArrayList al=new ArrayList();
		al.add("abc_1");
		al.add("abc_2");
		al.add("abc_3");
		al.add("abc_3");
		al.add("abc_4");
		al.add("abc_1");
		ArrayList b = getSingle(al);
		System.out.println(al);
		System.out.println(getSingle(al));
	}

	private static ArrayList getSingle(ArrayList al)  {
		ArrayList temp=new ArrayList();
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if(!temp.contains(obj)) {
				temp.add(obj);
			}
		}
		return temp;
	}

}
