class selectSort
{
	public static void main(String[] args)
	{
		int[] arr={1,23,34,1,32,123,324,434,12,3343,23,34,2321,343,23};
		System.out.print("≈≈–Ú«∞\n");
		sop(arr);
		select(arr);
		System.out.print("\n≈≈–Ú∫Û\n");
		sop(arr);
	}
	public static void sop(int[] arr)
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
	public static void select(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>=arr[y])
				{
					int temp=arr[y];
					arr[y]=arr[x];
					arr[x]=temp;
				}
			}
		}
	}
}



