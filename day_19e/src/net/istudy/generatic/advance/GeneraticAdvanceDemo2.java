package net.istudy.generatic.advance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import net.istudy_2.bean.Person;
import net.istudy_2.bean.Student;
import net.istudy_2.bean.Worker;

public class GeneraticAdvanceDemo2 {

	public static void main(String[] args) {
		ArrayList<Worker> list_1=new ArrayList<Worker>(); 
		list_1.add(new Worker("a_1",12));
		list_1.add(new Worker("a_2",42));
		ArrayList<Student> list_2=new ArrayList<Student>();
		list_2.add(new Student("b_1",12));
		list_2.add(new Student("b_2",19));
		ArrayList<Person> list_3=new ArrayList<Person>();
		list_3.add(new Person("c_1",21));
		list_3.add(new Person("c_2",33));
		/*printCollection_1(list_1);
		printCollection_1(list_2);*/
//		printCollection_2(list_1);
//		printCollection_2(list_2);
		printCollection_3(list_3);
	}
	private static void printCollection_3(ArrayList<? super Student> list_1) {
		Iterator<? super Student> iterator=list_1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	/*
	 * 迭代并打印集合中的元素，可以对集合进行限定	
	 * ? extends T:接受T类型或者T类型的子类类型对象，上限！
	 * 
	 * ? extends E:接受E类型或者E类型的父类类型对象，下限！
	 * 
	 * */
	private static void printCollection_2(ArrayList<? extends Person> list_1) {//泛型的限定
		for(Iterator<? extends Person> it=list_1.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}

	/**
	 * @param list_1
	 */
	/*private static void printCollection_1(Collection<? extends Object> list_1) {
		for(Iterator<?> it=list_1.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
	}*/
}
