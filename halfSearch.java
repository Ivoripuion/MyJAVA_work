//使用二分查找找出某一个数
//查找是在一组数中查找，故需要使用数组
//为方便阅读与提高代码复用性，将二分查找单独定义成一个函数
class halfSearch
{
	public static void main(String[] args)
	{
		System.out.print("使用二分法查找数组中某个数\n");
		int[] arr={0,1,2,3,434,555,666,7786};//输入的一组数据
		int Index=halfSearch(arr,555);
		System.out.print("Index="+Index);
	}
	public static int halfSearch(int[] arr,int key)
	{
		//二分查找需要三个变量，即两边的数与中间的数
		int max,min,mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			if(max<min)
				return -1;
			mid=(max+min)/2;
		}
		return mid;
	}
}
/*数组常见功能：二分查找。*/


