package day_16;
import java.util.*;

public class CollectionDemo_2 {

	public static void main(String[] args) {
		
		Collection coll=new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//使用了Collection iterator()的方。调用集合中的迭代器方法，是为了获取集合中的对象。
		
		for(Iterator it=coll.iterator();it.hasNext();) {
			System.out.println(it.next());	
		}
		
		System.out.println(coll);
	}

}
