package daye15;
/**
 * @param Carth
 * 
 * */
public class StringConstructDemo {
	public static void main(String[] args) {
		
		stringConstructDemo1();
		stringConstructDemo2();
		stringConstructDemo3();
	}

	private static void stringConstructDemo3() {
		char[] arr= {'a','a','n','f','a','t','e','o'};
		String str3=new String(arr,2,4);
		System.out.println("str3="+str3);
	}

	public static void stringConstructDemo1() {
		byte[] arr= {97,98,99,100};
		String str1=new String(arr);
		System.out.println("str1="+str1);
	}
	
	
	public static void stringConstructDemo2() {
		char[] arr= {'r','t','d'};
		String str2=new String(arr);
		System.out.println("str2="+str2);
	}
}
