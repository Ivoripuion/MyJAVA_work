/**
建立一个用于操作数组的工具类，其中包含了常见的对数组操作的方法。
@author Carth
@version V1.0.0
*/
public class arrayTool
{
	private arrayTool(){};//禁止对象的创立以避免内存空间的浪费。
	/**
	将所给数组进行排序。
	@param arr 接受一个元素为int类型的数组。
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[y]<=arr[x])
					swap(arr,x,y);
			}
		}
	}
	private static void swap(int[] arr,int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/**
	获取元素在数组中的索引。
	@param arr 接受一个元素为int类型的数组。
	@param key 要找的元素的下标。
	@return 返回该元素第一次出现的下标，若不存在返回-1。
	*/
	public static int Search(int[] arr,int key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==key)
				return x; 
		}
		return -1; 
	}
	/**
	获取整型数组的最大值
	@param arr 接受一个元素为int类型的数组。
	@return 该数组中最大的元素值。
	*/
	public static int getMax(int[] arr)
	{
		int arrMax=0;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[arrMax]<arr[x])
				arrMax=x;
		}
		return arr[arrMax];
	}
	/**
	将int数组转换成字符串。格式是：[,,.....,,]
	@param arr 接受一个元素为int类型的数组。
	@return 返回该字符串的表现形式。
	*/
	public static String ArrayToString(int[] arr)
	{
		String str1="[";
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				str1+=arr[x]+",";
			else
				str1+=arr[x]+"]";
		}
		return str1;
	}
}
