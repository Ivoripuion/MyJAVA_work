/*
	对于角标是整数不存在的情况等可以用JAVA中定义的异常类使用。
	
	负数角标这种异常JAVA未定义的就需要自己定义异常并进行封转描述。
	该自定义的问题描述就称为自定义异常。
	
	注意：若要一个类称为异常类，必须继承异常体系，只有这样才可以具备可抛性，
	才可以被throws,throw修饰。
	
*/
/*
		1,编译时被检测异常:只要是Exception和其子类都是，除了特殊子类RuntimeException体系。
		2,编译时不检测异常(运行时异常):就是Exception中的RuntimeException和其子类。
*/

class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String k)
	{
		super(k);
	}
}
class ExceptionTest3
{
	public static void main(String[] args)throws FuShuIndexException
	{
		int[] arr=new int[3];
		Test t=new Test();
		t.method(arr,-1);
	}
}
class Test
{
	public int method(int[] arr,int index)throws FuShuIndexException 
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
















