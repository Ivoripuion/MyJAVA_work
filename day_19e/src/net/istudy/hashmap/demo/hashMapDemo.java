package net.istudy.hashmap.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.istudy_2.bean.Student;

public class hashMapDemo {

	public static void main(String[] args) {
		/*
		 * 将学生对象和学生归属地通过键值对存储到Map集合中。
		 * */
		
		HashMap<Student,String> sql=new HashMap<Student,String>();
		sql.put(new Student("Harry",17), "山西");
		sql.put(new Student("Luis",23), "广东");
		sql.put(new Student("Jack",19), "上海");
		sql.put(new Student("Jack",19),"天津");
		
		Set<Map.Entry<Student,String>> rel=sql.entrySet();
		Iterator<Map.Entry<Student,String>> it=rel.iterator();
		while(it.hasNext()) {
			Map.Entry<Student,String> shuj=it.next();
			System.out.println(shuj.getKey()+" "+shuj.getValue());
		}
	}
}
