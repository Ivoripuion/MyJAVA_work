package net.istudy.generatic.advance;
	
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import net.istudy_2.bean.Person;
import net.istudy_2.bean.Student;
import net.istudy_2.bean.Worker;

public class GeneraticAdvanceDemo4 {

	public static void main(String[] args) {
		TreeSet<Person> al_1=new TreeSet<Person>(new CompByName());
		al_1.add(new Person("abc4",23));
		al_1.add(new Person("abc1",56));
		al_1.add(new Person("abc7",34));
		TreeSet<Worker> al_2=new TreeSet<Worker>(new CompByName());
		al_2.add(new Worker("w1",12));
		al_2.add(new Worker("w2",43));
		
		TreeSet<Student> al_3=new TreeSet<Student>();
		al_3.add(new Student("s1",14));
		al_3.add(new Student("s2",21));
		
		Iterator<Worker> iterator=al_2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

/*
 * 
 * class TreeSet<Worker>
 * {
 * 		Tree(Compare<? super Worker> c);
 * }
 * 
 * ? super e:
 * 通常对集合中元素进行取出操作时，可以使用下限	
 * */
class CompByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int temp=o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;

	}
	
}