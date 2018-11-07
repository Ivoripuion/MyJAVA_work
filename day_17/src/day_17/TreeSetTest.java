package day_17;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet tr=new TreeSet(new CompareByLength());
		tr.add(new Person("haha",23));
		tr.add(new Person("ade",24));
		tr.add(new Person("zz",45));
		System.out.println(tr);
	}
}
