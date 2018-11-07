package daye15;

public class StringDemo {
/**
 * @param Carth
 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		/*
		 * string类特点
		 * 字符串对象一但被初始化就不可以改变。
		 * */
//		stringDemo1();
		stringDemo2();
		stringDemo3();
	}

	public static void stringDemo3() {
		
	
	}

	public static void stringDemo2() {
		String s1="abc";//常量池中创建
		String s2=new String("abc");
		String s3=new String("abc");//堆中创建
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
	} 

	/**
	 * 明确常量池
	 */
	public void stringDemo1() {
		String a2="hahha";//a1存储在字符串常量池，没有创建，有就拿来用。
		String a1="hahha";
		System.out.println(a1==a2);
		System.out.println("a--"+a1);
	}

}
