package net.istudy.news.demo;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo {
/*
 * foreach语句：
 * 格式：
 * for(类型 变量:Collection集合或者数组)
 *{
 *
 *}
 * 
 * 可以对map直接使用foreach吗，不可以但是可以转换成set再使用
 * */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ada");
		list.add("loj");
		list.add("plh");
		list.add("fds");
		for(String x:list) {
			System.out.println(x);
		}
		
	} 

}
