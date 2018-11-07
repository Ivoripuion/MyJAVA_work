class ExceptionTest6
{
	public static void main(String[] args)
	{
		Test t=new Test();
		int[] arr=new int[10];
		try
		{
			int num=t.method(arr,-1);
			System.out.println("num..."+num);
		}
		catch(FuShuException k)
		{
			System.out.println(k);
			return ;//仍会执行finally,但是后续没有。
			//System.exit(0);//啥都没了，退出jvm
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("over");
	}
}
class Test
{
	int method(int[] arr,int index)throws FuShuException
	{
		if(index<0)
			throw new FuShuException("角标负数！！："+index);
		return arr[index];
	}
}
class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String k)
	{
		super(k);
	}
}

/*
	finally:一般用于关闭（释放）资源。
	比如对数据库操作的时候。

*/
/*
	try catch finally代码块组合特点：
	1,try catch finally
	
	2,try catch (多个)当没有必要资源释放时,可以不定义finally
	
	3,
	try finally
	
	void show()throws Exception
	{
		try
		{
			//开启资源
			throw new Exception()
		}
		finally
		{
			//关闭资源
		}
	}

*/
























