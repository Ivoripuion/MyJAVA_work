package net.istudy.treemap.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import net.istudy.comparator.CompareByAge;
import net.istudy_2.bean.Student;

public class treeMapDemo {

	public static void main(String[] args) {
		TreeMap<Student,String> sql_1=new TreeMap<Student,String>(new CompareByAge());
		
		sql_1.put(new Student("liu",12), "上海");
		sql_1.put(new Student("wu",19), "北京");
		sql_1.put(new Student("zhao",28), "天津");
		sql_1.put(new Student("zhang",11), "武汉");
		
		Set<Map.Entry<Student,String>> sj=sql_1.entrySet();
		Iterator<Map.Entry<Student,String>> me=sj.iterator();
		while(me.hasNext()) {
			Map.Entry<Student, String> t=me.next();
			System.out.println(t.getKey()+" "+t.getValue());
		}
	}
}
