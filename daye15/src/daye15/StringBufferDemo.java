package daye15;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

public class StringBufferDemo {
/*
 * StringBuffer就是字符串缓冲区
 * 用于存储数据的容器
 * 
 * 特点：
 * 1，长度可变
 * 2，可以存储不同类型的特点
 * 3，最终转成字符串进行使用 
 * 
 * 既然是一个容器，要有哪些功能？
 * 1，添加;
 * 		StringBuffer append(data)
 * 		StringBuffer insert(pos,data)
 * 2，删除;
 * 		StringBuffer delete(start,end):包含头，不包含尾
 * 		StringBuffer deieteCharAt(index):删除指定位置的元素
 * 		StringBuffer remove
 * 3，查找;
 * 		char charAt(index)
 * 		int indexOf(String)
 * 4，修改;
 * 		StringBuffer replace(int start,int end,StringBuffer string)
 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		stringBufferDemo_1();
		stringBufferDemo_2();
		stringBufferDemo_3();
		stringBufferDemo_4();

	}

	private static void stringBufferDemo_4() {
		StringBuffer sb=new StringBuffer("abxdefghij");
		sb.replace(0, 3,"kakdsfsda");
		System.out.println(sb.toString());
}

	private static void stringBufferDemo_3() {
		StringBuffer sb=new StringBuffer("abcdefg");
		sb.delete(1, 4);
		System.out.println(sb.toString());
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
		//清空缓冲区，缓冲区还在
		sb.delete(0, sb.length());//sb=new StringBuffer浪费内存
		System.out.println(sb.toString());
	}

	private static void stringBufferDemo_2() {
		StringBuffer sb=new StringBuffer();
		sb.append(true);
		sb.append(4);
		//StringBuffer sb1=sb.append("haha");
		System.out.println(sb.toString());
//		st
}

	/**
	 * 
	 */
	public static void stringBufferDemo_1() {
		//创建缓冲区对象
		StringBuffer sb=new StringBuffer();
		StringBuffer s1=sb.append(4).append(false).insert(1,"ja").append("hh");
		System.out.println(s1);
	}

}
