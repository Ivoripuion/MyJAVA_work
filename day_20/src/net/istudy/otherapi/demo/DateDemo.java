package net.istudy.otherapi.demo;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
//		methodDemo_1();
		methodDemo_2();
	}

	private static void methodDemo_2() {
		Date date=new Date();
		
		DateFormat df=DateFormat.getDateInstance();
		
		df=DateFormat.getDateTimeInstance();
	}

	/**
	 * 
	 */
	private static void methodDemo_1() {
		/*
		 * 日期对象和毫秒值之间的转换：
		 * 1,毫秒值-->日期对象
		 * 2,还可以通过setTime方法设置
		 * 
		 * 通过Date的构造方法所得
		 * 日期对象-->毫秒值：
		 * 1,getTime方法
		 * 2,因为可以通过具体的数值进行运算。
		 * */
		long time=System.currentTimeMillis();
//		System.out.println(time);//1537864218347l
		
		Date date_1=new Date();//当前日期和时间封装成date对象
		System.out.println(date_1);//Tue Sep 25 16:28:27 CST 2018
		Date date_2=new Date(1537864218351l);//将指定毫秒值封装成date对象
		System.out.println(date_2);
	}

}
