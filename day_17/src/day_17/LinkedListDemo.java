package day_17;


import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
//		for(Iterator it=list.iterator();it.hasNext();) {
//			System.out.println(it.next());
//		}
		
		
		while(!list.isEmpty()) {
			System.out.println(list.removeFirst());
		}
		System.out.println(list);
	}

}
