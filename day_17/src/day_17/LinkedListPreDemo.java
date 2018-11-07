package day_17;
/*
 * 
 * 请使用LinkedList来模拟一个堆栈或者队列数据结构.
 * 
 * 堆栈:先进后出	FILO
 * 
 * 队列:先进先出	FIFO
 * 
 * 我们应该描述这样一个容器 	  	 
 * 
 * */
import java.util.*;



public class LinkedListPreDemo {

	public static void main(String[] args) {
		DuiLie d=new DuiLie();
		d.myAdd("abc1");
		d.myAdd("abc2");
		d.myAdd("abc3");
		d.myAdd("abc4");
		
		while(!d.isNull()) {
			System.out.println(d.myGet());
			
		}
		
		
	}	

}
