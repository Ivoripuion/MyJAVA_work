package day_17;

import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		TreeSet st_1=new TreeSet(new CompareByStringLength());
		st_1.add("adad");
		st_1.add("qwsdsdss");
		st_1.add("sdassaaaaaaasdss");
		st_1.add("sdsd");
		st_1.add("sdsdss");
		st_1.add("sdsertdss");
		st_1.add("sdsdwwwwwwwss");
		System.out.println(st_1);
		Thread thread=new Thread(new Runnable() {
			public void run() {
				System.out.println("haha");
			}
		});
		Thread thread1=new Thread(new Runnable() {
			public void run() {
				System.out.println("haha1");
			}
		});
		thread.start();
		thread1.start();
	}

}
