package net.istudy.news.demo;

public class ParamterDemo {

	public static void main(String[] args) {
//		int [] arr= {4,5,45,5};
//		int sum=add(arr);
//		System.out.println(sum);
		
		int sum=newadd(21,51,8,6,9);
		System.out.println("sum="+sum);
	}
/*
 * 函数的可变参数，其实就是数组，简化调用者的书写
 *可变参数类型必须定义在参数列表的结尾处 
 *
 * */
	private static int newadd(int... arr) {
////	System.out.println(arr);
//		return 0;
		
		int sum=0;
		for(int x=0;x<arr.length;x++) {
			sum+=arr[x];
		}
		return sum;
	}

	private static int add(int []arr) {
		int sum=0;
		for(int x=0;x<arr.length;x++) {
			sum+=arr[x];
		}
		return sum;
	}

}
