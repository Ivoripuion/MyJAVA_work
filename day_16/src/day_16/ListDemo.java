package day_16;

import java.util.*;


public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		
//		show(list);
		
		list.add("a_1");
		list.add("a_2");
		list.add("a_3");
		list.add("a_4");
		
		System.out.println(list);
		ListIterator it=list.listIterator();//获取列表迭代器
		
		while(it.hasNext()) {
			Object ob=it.next();
			if(ob.equals("a_2")) {
				it.set("a_9");
			}
			else
				System.out.println(ob);
			
		}		
		System.out.println(list);
//		for(Iterator it=list.iterator();it.hasNext();){
//			System.out.println(it.next());
//		}
		//List特有的获取元素的方法:get
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("get: "+list.get(i));
//		}
		
//		
//		for(Iterator it=list.iterator();it.hasNext();){
//			Object ob=it.next();
//			if(ob.equals("a_2")) {
//				list.add("a_9");//迭代器使用过程中，不要使用容器进行操作，容易出现异常。
//				//可以使用Iterator的子接口ListIterator来完成在迭代中对元素进行更多的操作。
//				
//				
//			}
//			else
//				System.out.println("next: "+it);			
//		}
//		System.out.println(list);
		
	}

	private static void show(List list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println("list: "+list);
		//删除元素
//		list.remove(3);
		System.out.println("remove: "+list.remove(3));
		System.out.println("after remove: "+list);
		
		//改变元素
		System.out.println("set: "+list.set(1, "abc2_change"));
		System.out.println(list);
		
		//获取元素
		System.out.println("list.subList(0,2): "+list.subList(0, 2)); 
	}

}
