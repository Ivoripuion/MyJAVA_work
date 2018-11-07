class arrayToolTest
{
	public static void main(String[] args)
	{
		int[] arr={12,1224,324,243,233,1,243,23};
		System.out.print("arr: ");
		System.out.println(arrayTool.ArrayToString(arr));
		System.out.println("array_Max="+arrayTool.getMax(arr));
		arrayTool.selectSort(arr);
		System.out.print("æ≠≈≈–Ú£∫ ");
		for(int x=0;x<arr.length;x++)
			System.out.print(arr[x]+" ");
		System.out.println();
	}
}