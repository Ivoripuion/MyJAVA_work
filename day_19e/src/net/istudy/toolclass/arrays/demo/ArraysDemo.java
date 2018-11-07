package net.istudy.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;




public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * Arrays:集合框架的工具类，里面的方法都是静态的(意思就是说Arrays.function的形式使用方法)
		 * 
		 * 
		 * */
//		demo_2();
		
		/*
		 * 重点：List asList(数组)将数组转换成集合
		 * 好处：其实可以使用集合得方法操作数组中的元素
		 * 注意：数组的长度是固定的，所以集合中的增删方法是不可行的
		 * 
		 * */
//		demo_1();
//		demo_3();
		demo_4();
	}

	private static void demo_4() {
		//获取系统信息属性并存储在properties集合中
		Properties prop=System.getProperties();
		Set<String> propName=prop.stringPropertyNames();
		for(String x:propName) {
			String value=prop.getProperty(x);
			System.out.println(x+":"+value);
		}
	}

	private static void demo_3() {
		int[] arr= {21,35,55};
		List list=Arrays.asList(arr);
		System.out.println(list);
		/*
		 * 如果数组中的元素是对象，那么转化成集合时，集合中存储的是数组中的对象元素
		 * 
		 * 如果数组中的元素是基本数据类型，那么转化成集合是，集合中存储的是整个数组
		 * */
	}

	/**
	 * 
	 */
	private static void demo_2() {
		int[] arr= {3,1,5,6,3,6};
		List list=Arrays.asList(arr);//List<int []>list=Arrays.asList(arr);
		System.out.println(list);
	}

	/**
	 * 
	 */
	private static void demo_1() {
		String[] arr={"mid","top","sup","ad"}; 
		
		List<String> list=Arrays.asList(arr);
		System.out.println(list);
	}
	
	//toString的经典实现。
	
	public static String mytoString(int[] a) {//中间去掉了条件判断，提高了效率
		if (a==null)
			return "null";
		int iMax=a.length-1;
		if(iMax==-1)
			return "[]";
			StringBuilder b=new StringBuilder();
			b.append('[');
			for(int i=0;;i++) {
				b.append(a[i]);
			if(i==iMax)
				return b.append('[').toString();
			b.append(",");
			}
	}
	
	

}
