package day_17;

import java.util.LinkedList;

public class DuiLie{
	private LinkedList link;
	public DuiLie() {
		// TODO 自动生成的构造函数存根
		link = new LinkedList();
	}
	/*
	 * 
	 * 队列添加元素的功能。
	 * 
	 * */
	public void myAdd(Object obj) {
		link.add(obj);
	}
	public Object myGet() {
		return link.removeFirst();
	}
	public boolean isNull() {
		return link.isEmpty();
	}
}