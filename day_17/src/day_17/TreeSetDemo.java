package day_17;
 
import java.util.*;


public class TreeSetDemo {

	public static void main(String[] args) {
//		show_1();
//		show_2();
		show_3();
		
	}

	private static void show_3() {
		TreeSet tr=new TreeSet(new CompareByName());
		tr.add(new Person("abc",23));
		tr.add(new Person("sfs",33));
		tr.add(new Person("huds",43));
		tr.add(new Person("eew",44));
		tr.add(new Person("gf",73));
		tr.add(new Person("sfd",55));
		System.out.println(tr);
	}

	private static void show_2() {
		TreeSet tr=new TreeSet();
		//以Person的年龄对Person的对象进行从小到大的排序。
		tr.add(new Person("haha",12));
		tr.add(new Person("heihei",22));
		tr.add(new Person("xixi",43));
		tr.add(new Person("xixi",43));
		tr.add(new Person("hoho",24));
		tr.add(new Person("hehe",89));
		
		Iterator it=tr.iterator();
		while(it.hasNext()) {	
			Person p=(Person)it.next();
			System.out.println(p.getName()+"::"+p.getAge());
		}
	}

	/**
	 * 
	 */
	private static void show_1() {
		TreeSet tr=new TreeSet();
		
		tr.add("abc_1");
		tr.add("abvd");
		tr.add("ns");
		tr.add("sfsf");
		
		Iterator it=tr.iterator();
		while(it.hasNext()) {
			Object object=it.next();
			System.out.println(object);
		}
	}
}

