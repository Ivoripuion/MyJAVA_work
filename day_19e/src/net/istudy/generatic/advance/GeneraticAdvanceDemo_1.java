package net.istudy.generatic.advance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GeneraticAdvanceDemo_1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("aasbdfc");
		arrayList.add("wasder");
		arrayList.add("adsfdc");
		arrayList.add("ewwrew");
		printElement(arrayList);
		HashSet<Integer> arrayList2=new HashSet<Integer>(2);
		arrayList2.add(3);
		arrayList2.add(32);
		arrayList2.add(234);
		arrayList2.add(68);
		arrayList2.add(31213);
		printElement(arrayList2) ;
	}

	/**
	 * @param arrayList
	 */
	private static void printElement(Collection<?> arrayList) {
		Iterator<?> it_1=arrayList.iterator();
		while(it_1.hasNext()) {
			System.out.println(it_1.next().toString());
		}
	}

}
