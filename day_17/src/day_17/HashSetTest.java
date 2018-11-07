package day_17;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 
 * 往HashSet里存储Person若name age相同，一个人
 * 
 * HashSet集合数据是哈希表，所以存储元素的时候，
 * 使用元素的HashCode方法来确定位置，如果位置相同，再通过元素的equals来确定是否相同。
 * 
 * 
 * */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(new Person(23,"Jack"));
		hs.add(new Person(41,"Jacket"));
		hs.add(new Person(12,"Jacketa"));
		hs.add(new Person(12,"Jacketa"));
//		hs.add(new Person(52,"Jacketate"));
//		hs.add(new Person(19,"Jacketater"));
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Person p=(Person)it.next();
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}

}
