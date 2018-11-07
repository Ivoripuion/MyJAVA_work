package cn.itcast.regex.demo;

import com.sun.org.apache.xpath.internal.functions.FunctionDef1Arg;

public class RegexDemo2 {
	public static void main(String[] args) {
		/*
		 * 
		 * 正则表达式对字符串的常见操作：
		 * 1，匹配：
		 * 		其实就是使用String里的matches方法
		 * 
		 * 2，切割
		 * 		其实就是String里的split方法
		 * 组的概念
		 * 		
		 * 3，替换
		 * 		其实使用的就是String中的replaceAll方法
		 * 
		 * 
		 * 4，获取
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
//		functionDemo_1(); 
//		functionDemo_2();
//		functionDemo_3();
		functionDemo_4();
	}

	private static void functionDemo_4() {
		
		
		
		
	}

	private static void functionDemo_3() {
		String str1="eeeeesdggdfhgfb";
		String str2="13814652886";
		
		str1=str1.replaceAll("(.)\\1+","$1");
		str2=str2.replaceAll("(\\d{3})(\\d{5})(\\d{3})", "$1****$3");
		System.out.println(str2);
//		System.out.println(str1);
	}

	private static void functionDemo_2() {
		//
		String str2="guhaollllljibassssskika";
		
		
		String[] names=str2.split("(.)\\1+");
		
		for (String name:names) {
			System.out.println(name);
		}
		
	}

	private static void functionDemo_1() {
		//匹配手机号码是否正确
		
		String str1="13510022558";
		String regex="1[358]\\d{9}";
		
		boolean b=str1.matches(regex);
		
		System.out.println("Tel: "+b);
	}
}












