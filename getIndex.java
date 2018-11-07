class getIndex
{
	public static void main(String[] args)
	{
		int[] arr={0,4,21,23,432,12,31,31,3,312,2};
		int Index=getIndex(arr,278);
		System.out.print(Index);
	}
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0;x<=arr.length-1;x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
}
/*数组常见功能：查找。*/


