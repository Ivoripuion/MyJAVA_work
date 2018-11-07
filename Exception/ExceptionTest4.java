//RuntimeException Test
//这种直接跳出，不需要解决问题因为没有解决方法。
class FuShuIndexException extends RuntimeException
{
	FuShuIndexException()
	{}
	FuShuIndexException(String k)
	{
		super(k);
	}
}
class ExceptionTest4
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		Test t=new Test();
		t.method(arr,-1);
	}
}
class Test
{
	public int method(int[] arr,int index)
	{
		if(index>=arr.length)
			throw new ArrayIndexOutOfBoundsException("越界啦:"+index);
		if(arr==null)
			throw new NullPointerException("空指针警告");
		if(index<0)
			throw new FuShuIndexException("角标为负数:"+index);
		return arr[index];
	}
}
/*
	自定义异常时，要么继承Exception，要么继承RuntimeException。
	
*/






