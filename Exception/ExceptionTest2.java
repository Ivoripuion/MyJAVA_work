class ExceptionTest2
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		int t=method(null,-11);
		System.out.println(t);
	}
	public static int method(int[] arr,int index)
	{
		if(index>=arr.length)
			throw new ArrayIndexOutOfBoundsException("越界了错森:"+index);
		if(index<0)
			throw new ArrayIndexOutOfBoundsException("错森角标变成负数了:"+index);
		if(arr==null)
			throw new NullPointerException("你传了个啥?空的?");
		return arr[index];
	}
}
