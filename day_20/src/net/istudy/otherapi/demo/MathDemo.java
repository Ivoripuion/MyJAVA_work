package net.istudy.otherapi.demo;

public class MathDemo {

	public static void main(String[] args) {
		/*
		 * Math里的方法大都是静态的
		 * 
		 * 常用方法:
		 * ceil():返回大于参数的最小整数
		 * floor():返回小于参数的最小整数
		 * round():返回四舍五入的整数
		 * */
		double d1=Math.ceil(12.56);
		double d2=Math.floor(12.56);
		double d3=Math.round(12.56);
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
		System.out.println("d3:"+d3);
		
		double d=Math.pow(1.2,22);
		System.out.println(d);
	}	

}
