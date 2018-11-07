package daye15;

public class StringBuilderDemo {
	
	/*
	 * 将一个int数组转变成
	 * 
	 * */
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,34};
		String str_1=arrayToString_1(arr);
		String str_2=arrayToString_2(arr);
		System.out.println(str_2);
		//System.out.println(str);
	}

	private static String arrayToString_2(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				sb.append(arr[i]+",");
			else
				sb.append(arr[i]+"]");
		}
		return sb.toString();
	}

	private static String arrayToString_1(int[] arr) {
		String str="[";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				str+=arr[i]+",";
			else
				str+=arr[i]+"]";
		} 
		return str;
	}

}
