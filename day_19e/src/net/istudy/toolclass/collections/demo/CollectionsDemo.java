package net.istudy.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionsDemo {

	/*
	 * Collections:集合框架的工具类，里面的方法都是静态的	
	 * 
	 * */
	public static void main(String[] args) {
		demo_1();
	}

	public static void demo_1() {
		List<String> list=new ArrayList<String>();
		list.add("ad");
		list.add("fr");
		list.add("ad");
		list.add("gtr");
		list.add("mx");
		System.out.println(list);
		//对list集合进行指定顺序的排序
		Collections.sort(list);
		System.out.println(list);
		
	}
}
