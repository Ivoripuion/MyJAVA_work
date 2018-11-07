package net.istudy.generatic.demo;

import java.util.Iterator;
import java.util.TreeSet;
import net.istudy.comparator.CompareByAge;
import net.istudy_2.bean.Person;

public class GenericDemo_2 {

	public static void main(String[] args) {
		TreeSet<Person> ts=new TreeSet<Person>(new CompareByAge());
		ts.add(new Person("huan_1", 12));
		ts.add(new Person("huan_1", 12));
		ts.add(new Person("huan_3", 72));
		ts.add(new Person("huan_4", 22));
		ts.add(new Person("huan_5", 23));
		
		Iterator<Person> it=ts.iterator();
		
		while(it.hasNext()) {
			Person p=(Person)it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
