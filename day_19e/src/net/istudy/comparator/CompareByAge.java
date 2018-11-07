package net.istudy.comparator;

import java.util.Comparator;

import net.istudy_2.bean.Person;

public class CompareByAge implements Comparator<Person>{

	public int compare(Person arg0, Person arg1) {
		int temp=arg0.getAge()-arg1.getAge();
		return temp==0?arg0.getName().compareTo(arg1.getName()):temp;
	}

}
