package daye15;

/*
 * 给定字符串数组。按照字典顺序进行从大到小的排序。
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * 思路：
 * 1，对数组进行排序。
 * 2，for嵌套和比较以及换位。
 * 
 * 一个子串在整串中出现的次数。
 * "nbaernbatynbauinbaopnba"
 * 思路：
 * 1，要找的子串是否存在，若存在获取其位置。用indexOf完成。
 * 2，若果找到了，那么记录出现的位置并在剩余字符串中继续查找该子串。
 * 
 * 
 * 
 * 两个字符串中最大相同的子串
 * 1，既然取得是最大子串，先看短的字符串是否在那个长的字符串中
 * 如果存在，短的那个就是最大子串
 * 2，如果不是，将短的那个进行长度递减的方式去子串，去长串中判断是否存在。
 * 
 * 
 * 
*/
public class StringTest {
	public static void main(String[] args) {
//		String[] arr= {"nba","abc","cba","zz","qq","haha"};
//		stringSort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("");
//		String str="nbaernbatynbauinbaopnba";
//		String key="nba";
//		int count=stringCount_1(str,key);
//		System.out.println("The count of \""+key+"\" = "+count);
//		int count=stringCount_2(str,key);
//		System.out.println("The count of \""+key+"\" = "+count);
//		String str1="diu";
//		String key2="hahuhiahdiufw";
//		String str2=stringCount_3(str1,key2) ;
//		System.out.println(str2);
		
		
		
	}
/*
 * 获取最大子串
 * 
 * */
	private static String stringCount_3(String str1, String key2) {
		for(int x=0;x<str1.length();x++){
			for(int y=0,z=str1.length()-x;z!=str1.length()+1;y++,z++) {
				String subStr=str1.substring(y,z);
//				System.out.println(subStr);
				if(key2.contains(subStr))
					return subStr;
			}
		}
		return null;
	}

	private static int stringCount_2(String str, String key) {
		int count=0;
		return count;
	}

	private static int stringCount_1(String str,String key) {
		int count=0;
		int index=0;
		while((index=str.indexOf(key))!=-1){
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}

	private static void stringSort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String str;
					str=arr[i];
					arr[i]=arr[j];
					arr[j]=str;
				}				
			}
		}
	}
	
}
		














