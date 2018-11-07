package day_17;

import java.util.Comparator;

public class CompareByLength implements Comparator{

	public int compare(Object o1, Object o2) {
		Person p_1=(Person)o1;
		Person p_2=(Person)o2;
		int temp=p_1.getName().length()-p_2.getName().length();
		return temp==0?p_1.getName().compareTo(p_2.getName()):temp;
	}

}
