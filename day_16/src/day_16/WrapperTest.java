package day_16;
/*
 * 对一个字符串中的数值进行从大到小的排序
 * 
 * "21,211,123,-21,-2,21,11"
 * 
 *
 * 
 * */
public class WrapperTest {
	public static void main(String[] args) {
		String str1="21,211,123,-21,-2,21,11";
		String[] arr_1=str1.split(",");
		for(int x=0;x<arr_1.length;x++)
		{
			for (int i = x + 1; i < arr_1.length; i++)
			{
				int k=Integer.parseInt(arr_1[x]);
				int l=Integer.parseInt(arr_1[i]);
				if(k>l)
				{
					String tmp;
					tmp=arr_1[x];
					arr_1[x]=arr_1[i];
					arr_1[i]=tmp;
				}
			}
		}
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print(arr_1[i]+" ");
		}
	}
}
