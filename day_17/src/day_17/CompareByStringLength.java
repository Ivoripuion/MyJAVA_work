package day_17;

import java.util.Comparator;

public class CompareByStringLength implements Comparator{

	public int compare(Object o1, Object o2) {
		String str_1=(String)o1;
		String str_2=(String)o2;
		int temp=str_1.length()-str_2.length();		
		return temp;
	}

}
