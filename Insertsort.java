//插入排序
class Insertsort
{
	public static void main(String[] args)
	{
		int[] arr={9,3,1,4,2,7,6,8,10,5};
		System.out.print("排序前\n");
		sop(arr);
		System.out.print("\n排序后\n");
		Insertsort(arr);
		sop(arr);
	}
	public static void Insertsort(int[] arr)//插入排序具体算法
	{
		for(int j=1;j<=arr.length-1;j++)
		{
			int key=arr[j];//从牌堆中拿出的一张牌。
			int i=j-1;//定义原来手中的牌。
			while(i>=0&&arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}
	public static void sop(int[] arr)//打印数组的函数。
	{
		System.out.print("[");
		for(int x=0;x<=arr.length-1;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]+"]");
		}
	}
}