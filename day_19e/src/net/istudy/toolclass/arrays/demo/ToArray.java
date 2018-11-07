package net.istudy.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
/*
 * 如何实现集合转成数组呢
 * 
 * 使用的就是Collection中接口中的toArray方法
 * 
 * 集合转化数组：对集合中的元素进行限定，不允许进行增删
 * */
		List<String> list=new ArrayList<String>();
		list.add("da");
		list.add("hl");
		list.add("lop");
		
		String []arr=list.toArray(new String[4]);
		System.out.println(Arrays.toString(arr));
	}
/*
 * toArray方法需要传入一个指定类型的数组
 * 长度该如何定义呢
 * 如果长度小于集合的size，那么该方法会创建一个同类型并且和集合相同size的数组
 * 如果长度大于集合的size，那么就会使用指定的数组存储指定元素，其他位置为空
 * 最好长度指定为集合的size
 * 
 * */
}
