package day_17;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorDemo_1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		
		Enumeration  en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
//		
//		Iterator it=v.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			
//		}
//			
		
	}

}
