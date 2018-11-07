package daye15;

/*
 * 按照面向对象思想将字符串功能进行分类
 * 
 * 1，获取
 * 1.1，获取字符串长度
 * 		int length();
 * 1.2，根据位置获取字符
 * 		char charAt(int index)
 * 1.3，根据字符获取在字符串第一次出现的位置。
 * 		int indexOf (int ch)
 * 		从指定的索引开始搜索，返回在此字符串中第一次出现指定字符处的索引。 
 * 		int indexOf(int ch, int fromIndex) 
 * 		从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。 
 * 		int indexOf(String str, int fromIndex)
 * 		返回第一次出现的指定子字符串在此字符串中的索引。 
 * 		int indexOf(String str)    
 *1.4，获取字符串中的一部分字符串，也叫子串
 *		String substring(int,int)
 *		substring(int beginIndex)
 *	
 *2，转换
 *2.1，将字符串转换成字符数组。
 *		String[] split(String regex) :涉及到正则表达式
 *2.2，将此字符串转换为一个新的字符数组。
 *		char[] toCharArray()  	
 *2.3，使用指定的字符集将此 String 解码为字节序列，并将结果存储到一个新的字节数组中。    
 *		byte[] getBytes(String charsetName) 
 *2.4，返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 而生成的。
 *		String replace(char oldChar, char newChar) 
 *2.5，将指定字符串联到此字符串的结尾。
 *		String concat(String str) 
 *
 *3，判断
 *3.1，两个字符串内容是否相同。
 *		boolean equals(Object anObject) 
 *3.2，当且仅当此字符串包含 char 值的指定序列时，才返回 true。
 *		boolean contains(CharSequence s) 
 */
public class StringMethodDemo {
	public static void main(String[] args) {
//		stringMethod_1();
//		stringMethod_2();
//		stringMethod_3();
//		stringMethod_4();
//		stringMethod_5();
//		stringMethod_6();
//		stringMethod_7(); 
		stringMethod_8(); 
	}

	private static void stringMethod_8() {
		String str="abcdefg";
		System.out.println(str.equalsIgnoreCase("ABCDEFG"));
	}

	private static void stringMethod_7() {
		String str="abg";
		System.out.println(str.concat("sdd"));
	}

	private static void stringMethod_6() {
		String str="jhisfhosd卡";
		String st=str.replace('h', '3');
		System.out.println(st);
		System.out.println("-"+" ads d s  ".trim()+"+");
	}

	private static void stringMethod_5() {
		String str="jhisfhosd卡";
		byte[] arr=str.getBytes();
		for (int i = 0; i < arr.length; i++) {
			byte b = arr[i];
			System.out.print(arr[i]+" ");
		}
	}

	private static void stringMethod_4() {
		String str="abc";
		char[] s=str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			char c = s[i];
			System.out.println(s[i]);
		}
	}

	private static void stringMethod_3() {
		String str="张三.李四.王五";
		String[] s=str.split("\\.");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static void stringMethod_2() {
		String str="abbccddeesds";
		System.out.println(str.substring(2,6));
		System.out.println(str.substring(3));
	}

	private static void stringMethod_1() {
		String str="abccccde";
		System.out.println(str.length());
		System.out.println(str.indexOf('c',4));
		System.out.println(str.indexOf("cc"));
		System.out.println(str.charAt(4));
		System.out.println(str.lastIndexOf("cc"));
		System.out.println(str.lastIndexOf("cd"));
	}
}




